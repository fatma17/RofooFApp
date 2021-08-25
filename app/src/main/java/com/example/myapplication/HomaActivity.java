package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.os.Bundle;

public class HomaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homa);

        /*  Button cook = (Button) findViewById(R.id.Co);

         cook.setOnClickListener(new View.OnClickListener(){
            @Override
           public void onClick (View v)  {
                intent i = new Intent (MainActivity.this, هنا .class);
                startActivity(i);
        } });
         /* Button classic =(Button)findViewById(R.id.CL);
        classic.setOnClickListener(new View.OnClickListener(){
        Override
           public void onClick (View v)  {
          Intent j = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
            startActivity(j);
        } });
       Button Fantasy =(Button)findViewById(R.id.F);
         Fantasy.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick (View v)  {
         Intent f = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
        startActivity(f);
         } });
         Button Horror =(Button)findViewById(R.id.H);
         Horror.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick (View v)  {
          Intent h = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
         startActivity(h);
         } });
          Button mystery =(Button)findViewById(R.id.M);
         mystery .setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick (View v)  {
            Intent m = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
        startActivity(m);
          } });
        Button myfav=(Button)findViewById(R.id.MY);
          myfav.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick (View v)  {
            Intent u = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
         startActivity(u);
           } });
         Button science =(Button)findViewById(R.id.SCI);
        science.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick (View v)  {
          Intent s = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
         startActivity(s);
          } });
        Button short_stories  =(Button)findViewById(R.id.SH);
         short_stories.setOnClickListener(new View.OnClickListener(){
           @Override
          public void onClick (View v)  {
         Intent sh = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
         startActivity(sh);
          } });
         Button romance =(Button)findViewById(R.id.R);
          romance.setOnClickListener(new View.OnClickListener(){
          @Override
         public void onClick (View v)  {
          Intent r = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
           startActivity(r);
          } });
         Button poety =(Button)findViewById(R.id.P);
         poety.setOnClickListener(new View.OnClickListener(){
           @Override
         public void onClick (View v)  {
            Intent b = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
        startActivity(b);
           } });
         Button scientific =(Button)findViewById(R.id.SC);
         scientific.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick (View v)  {
          Intent si = new Intent (MainActivity.this,  هنا اسم الصفحة .class)
         startActivity(si);
         } });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.E) {
            Toast.makeText(this, "Exit was done ", Toast.LENGTH_SHORT).show();
            finish();
        }
        if (id == R.id.H) {
            Toast.makeText(this, "Home page", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.m) {
            Toast.makeText(this, " My Favorite page ", Toast.LENGTH_SHORT).show();
            // Intent intent = new Intent(MainActivity.this, المضلة اسم .class);
            //  startActivity(intent);
        }

        return super.onOptionsItemSelected(item);

    }
}