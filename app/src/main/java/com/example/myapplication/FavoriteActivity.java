package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    ListView  list_book;
    Fav_database db;
    String book_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);


        list_book=(ListView)findViewById(R.id.list_book);
        db=new Fav_database(this);

        ArrayList<myfavorites> data =db.getalldata();


        Adpter_Favorite Adpter=new Adpter_Favorite(this, R.layout.list_item_fav, data);
        list_book.setAdapter(Adpter);

        Button btndelet = (Button)findViewById(R.id.btndelet);
        Button btnread = (Button)findViewById(R.id.btnread);

       /*btndelet.setOnClickListener(new View.OnClickListener() {
         if(username==
             db.delete_book(String book_name)
              Toast.makeText(MainActivity.this,"لقد تم حذف الكتاب  بنجاح ",Toast.).show();
        });

      / btndelet.setOnClickListener(new View.OnClickListener() {


        });
        */

    }
}