package com.example.myapplication;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class bookadpter extends ArrayAdapter<bookmodel> {
    Context context  ;
    int resource ;

    public bookadpter(@NonNull Context context, int resource, @NonNull ArrayList<bookmodel>  objects ) {
        super(context, resource, objects);
        this.context = context ;
        this.resource = resource ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(resource,parent,false);
        TextView tvname = convertView.findViewById(R.id.name) ;
        TextView tvtybe = convertView.findViewById(R.id.type) ;
        ImageView tvimage = convertView.findViewById(R.id.image) ;


        bookmodel book = getItem(position);

        tvname.setText(book.getName());
        tvtybe.setText(book.getType());
        tvimage .setImageResource(book.getImage());

        return convertView;
    }

}
