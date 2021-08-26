package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class Fav_database  extends SQLiteOpenHelper {

    private static final String dataBase_Name = "fav";


    public Fav_database(Context contexct) {
        super(contexct,dataBase_Name, null, 1);

    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table fav ( name_user text not null,name_book text not null )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists fav ");
        onCreate(sqLiteDatabase);
    }

    public void add_fav_book(String user_name,String book_name  )
    {
        SQLiteDatabase db = this.getWritableDatabase();
         db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nameuser",user_name);
        values.put("namebook",book_name);
        db.insert("fav" ,null,values) ;
        db.close();
    }
    public boolean check_user(){
        return true;
    }

    public ArrayList<myfavorites> getalldata() {
        ArrayList<myfavorites> arrayList = new ArrayList<>() ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from fav", null);
        if(cursor.moveToFirst()) {

            do{
                String namebook=cursor.getString(1);
                myfavorites book= new myfavorites(namebook);
                arrayList.add(book);
            }
            while (cursor.moveToNext()) ;

        }
        return arrayList ;
    }


    public  void delete_book(String book_name){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("fav","id=?",new String[] {book_name});

    }
}
