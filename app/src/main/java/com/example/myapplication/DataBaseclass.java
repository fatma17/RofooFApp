package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseclass extends SQLiteOpenHelper {

    private static String DataBaseName = "AppDataBase";
    SQLiteDatabase AppDataBase;
    //constructor
    public DataBaseclass(Context context1){
        super(context1 ,DataBaseName,null ,1 );
    }
   // database creation
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users ( Name text not null,Email text primary key, Password text not null )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists users");
        onCreate(db);
    }
    // adding new record
    public void AddNewUser (String name , String email , String password ){
        ContentValues row = new ContentValues();
        row.put("Name",name);
        row.put("Email",email);
        row.put("Password",password);
        AppDataBase= getWritableDatabase();
        AppDataBase.insert("users",null,row);
        AppDataBase.close();
    }
    public boolean loginCheck (String email , String password ){
        AppDataBase=getReadableDatabase();
        String [] RowDetails= {"Email","Password"};
        Cursor cursor =AppDataBase.rawQuery("select * from users where Email =? and Password =?",new String[] {email , password});
       if (cursor.getCount()>0)
                return true;
       else
           return false;
    }
    // checking whether the email already exists or not
    public boolean exist (String EMail){

        AppDataBase=getReadableDatabase();
        Cursor cursor =AppDataBase.rawQuery("select * from users where Email =? ",new String[] {EMail});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
