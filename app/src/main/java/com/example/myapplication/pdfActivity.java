package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivity extends AppCompatActivity {

    PDFView p ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        /*Intent data = getIntent();
        String s = data.getExtras().getString("a1");

        p = (PDFView) findViewById(R.id.pdfView) ;
        p.fromAsset(s+".pdf").load();*/
    }
}