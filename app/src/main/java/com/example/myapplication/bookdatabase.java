package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class bookdatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "d";

    public bookdatabase(Context con )
    {
        super(con,DATABASE_NAME,null ,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table book ( name TEXT , type TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists book ");
        onCreate(sqLiteDatabase);
    }

    public void insert(String bookname ,String booktybe  )
    {
        SQLiteDatabase s = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",bookname);
        values.put("type",booktybe);
        s.insert("book" ,null,values) ;
    }


    public ArrayList<bookmodel> getdata() {
        ArrayList<bookmodel> arrayList = new ArrayList<bookmodel>() ;
        SQLiteDatabase s = this.getReadableDatabase();
        Cursor cursor = s.rawQuery("select * from book", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {

            arrayList.add(new bookmodel(cursor.getString(0),cursor.getString(1)));
            cursor.moveToNext();
        }
        return arrayList ;
    }


}
