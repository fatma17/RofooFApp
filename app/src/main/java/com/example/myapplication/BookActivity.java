package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        bookdatabase BOOKS = new bookdatabase(this);

        BOOKS.insert("1984"                                         ,"classics");
        BOOKS.insert("a-christmas-carol"                            ,"classics");
        BOOKS.insert("the-adventures-of-huckleberry-finn"           ,"classics");
        BOOKS.insert("covenant-of-blood-obooko"                ,"fantasy books");
        BOOKS.insert("mrs-macabre-obooko"                      ,"fantasy books");
        BOOKS.insert("StolenMoonLondor-obooko-fan0081" ,        "fantasy books");
        BOOKS.insert("mercenary-stellen-qxz-obooko" ,                 "mystery");
        BOOKS.insert("the-gilgamesh-project-book-4-ibiza-obooko (1)" ,"mystery");
        BOOKS.insert("up-glenn-gillis-obooko"                        ,"mystery");
        BOOKS.insert("A Calling for Phoebe"                          ,"romance");
        BOOKS.insert("Healing-Her-Heart"                             ,"romance");
        BOOKS.insert("The-Unveiling"                                 ,"romance");
        BOOKS.insert("Recruit"                               ,"science fiction");
        BOOKS.insert("The-Boy-Who-Fell-from-the-Sky"         ,"science fiction");
        BOOKS.insert("Titan's-Plague-The-Trial"              ,"science fiction");
        BOOKS.insert("beauty_and_the_beast"                    ,"short stories");
        BOOKS.insert("the_place_where_chicago_was"             ,"short stories");
        BOOKS.insert("The Story of an Hour"                    ,"short stories");

        ArrayList<bookmodel> m = BOOKS.getdata();

       /* findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (BookActivity.this,pdfActivity.class);
                i.putExtra("a1","beauty_and_the_beast");
                startActivity(i);

                //   Toast.makeText( MainActivity.this,m.get(1).getName()+"",Toast.LENGTH_LONG).show();
            }
        });*/


    }
}