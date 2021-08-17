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
        db.execSQL("create table users ( Name text not null,Email text primary key, Password text not null, Isblocked boolean )");
        db.execSQL("create table phones ( Name text not null,Description text, Id integer  primary key autoincrement, Image text ,Price integer )");
        db.execSQL("create table tvs ( Name text not null,Description text, Id integer  primary key autoincrement, Image text ,Price integer )");
        db.execSQL("create table laptops ( Name text not null,Description text, Id integer  primary key autoincrement, Image text ,Price integer )");
        db.execSQL("create table headphones ( Name text not null,Description text, Id integer  primary key autoincrement, Image text ,Price integer )");
        db.execSQL("create table cameras ( Name text not null,Description text, Id integer  primary key autoincrement, Image text ,Price integer )");
        db.execSQL("create table smartwatches ( Name text not null,Description text, Id integer  primary key autoincrement, Image text ,Price integer )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists users");
        db.execSQL("drop table if exists phones");
        db.execSQL("drop table if exists tvs");
        db.execSQL("drop table if exists laptops");
        db.execSQL("drop table if exists headphones");
        db.execSQL("drop table if exists cameras");
        db.execSQL("drop table if exists smartwatches");
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
