package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {
    ListView list_book ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Intent data = getIntent() ;
       String s = data.getExtras().getString("a1") ;
        list_book = (ListView) findViewById(R.id.listbook) ;

        bookdatabase BOOKS = new bookdatabase(this);

        BOOKS.insert("1984"                                         ,"classics" , R.drawable.a1984);
        BOOKS.insert("a-christmas-carol"                            ,"classics", R.drawable.carol);
        BOOKS.insert("the-adventures-of-huckleberry-finn"           ,"classics", R.drawable.hucklebreey);

        BOOKS.insert("covenant-of-blood-obooko"                ,"fantasy", R.drawable.mercen);
        BOOKS.insert("mrs-macabre-obooko"                      ,"fantasy", R.drawable.macadre);
        BOOKS.insert("StolenMoonLondor-obooko-fan0081" ,        "fantasy",R.drawable.upp);


        BOOKS.insert("mercenary-stellen-qxz-obooko" ,                 "mystery",R.drawable.mercen );
        BOOKS.insert("the-gilgamesh-project-book-4-ibiza-obooko (1)" ,"mystery",R.drawable.macadre );
        BOOKS.insert("up-glenn-gillis-obooko"                        ,"mystery",R.drawable.upp );


        BOOKS.insert("A Calling for Phoebe"                          ,"romance",R.drawable.calling);
        BOOKS.insert("Healing-Her-Heart"                             ,"romance",R.drawable.her);
        BOOKS.insert("The-Unveiling"                                 ,"romance",R.drawable.un);

        BOOKS.insert("Recruit"                               ,"science fiction",R.drawable.titan);
        BOOKS.insert("The-Boy-Who-Fell-from-the-Sky"         ,"science fiction",R.drawable.boy);
        BOOKS.insert("Titan's-Plague-The-Trial"              ,"science fiction",R.drawable.rr);

        BOOKS.insert("beauty_and_the_beast"                    ,"short stories",R.drawable.beauty);
        BOOKS.insert("the_place_where_chicago_was"             ,"short stories",R.drawable.was);
        BOOKS.insert("The Story of an Hour"                    ,"short stories",R.drawable.hour);

        BOOKS.insert("Hamlet"                    ,"Horror",R.drawable.hamelt);
        BOOKS.insert("The castle of otranto"                    ,"Horror",R.drawable.otranto);
        BOOKS.insert("The valley of fear"                    ,"Horror",R.drawable.fear);

        BOOKS.insert("free_stonesoup_ecookbook"                    ,"Cook books",R.drawable.c);
        BOOKS.insert("USU-Student-Cookbook-FINAL-1"                    ,"Cook books",R.drawable.b);
        BOOKS.insert("Dinners_Cookbook_508-compliant"                    ,"Cook books",R.drawable.a);

        BOOKS.insert("afterpastures-hero-obooko"                    ,"Poetry",R.drawable.a1);
        BOOKS.insert("Poems of 1980"                    ,"Poetry",R.drawable.a2);
        BOOKS.insert("The golden book of modern English"                    ,"Poetry",R.drawable.a3);

        BOOKS.insert("dracula"                                         ,"Thriller Books" , R.drawable.dracula);
        BOOKS.insert("The Last Man"                            ,"Thriller Books", R.drawable.lastman);
        BOOKS.insert("The riddle of sand"           ,"Thriller Books", R.drawable.riddle);


        ArrayList<bookmodel> mm = BOOKS.getdata(s);
        bookadpter adpter = new bookadpter(this , R.layout.item_book , mm ) ;
        list_book.setAdapter(adpter);

        list_book.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               // Toast.makeText( BookActivity.this, mm.get(i).getName() ,Toast.LENGTH_LONG).show();
                Intent j = new Intent (BookActivity.this, pdfActivity.class);
                j.putExtra("a1",mm.get(i).getName());
                startActivity(j) ;
            }
        });

    }

}
