package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adpter_Favorite extends ArrayAdapter<myfavorites> {

    Context context;
    int resource;


    public Adpter_Favorite(@NonNull Context context, int resource, @NonNull List objects){
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(resource,parent,false);
        TextView BOOKNAME=(TextView) convertView.findViewById(R.id.BOOKNAME);
        myfavorites book= (myfavorites)getItem(position);
        BOOKNAME.setText(book.getName_book());
        return convertView;
    }


}
