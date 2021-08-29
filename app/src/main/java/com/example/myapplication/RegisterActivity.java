package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        SQLiteDatabase AppDataBase;
        Button RegBtn = (Button)findViewById(R.id.Regbutton);
        final EditText Name_Text = (EditText) findViewById(R.id.NameText);
        final EditText Email_Text = (EditText) findViewById(R.id.EmailText);
        final EditText Password_Text = (EditText) findViewById(R.id.PasswordText);
        final EditText RePassword_Text = (EditText) findViewById(R.id.RePasswordText);
        final  DataBaseclass DataBaseObject = new DataBaseclass(this);

        RegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailvalue = Email_Text.getText().toString();
                String passwordvalue = Password_Text.getText().toString();
                String namevalue = Name_Text.getText().toString();
                String repasswordvalue = RePassword_Text.getText().toString();
                if (emailvalue.equals("")|| passwordvalue.equals("") || repasswordvalue.equals("")||namevalue.equals("") )
                {
                    Toast.makeText(RegisterActivity.this,"Please enter all the fields",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (DataBaseObject.exist(emailvalue))
                    {
                        Toast.makeText(RegisterActivity.this, "This email already exists", Toast.LENGTH_LONG).show();
                    }
                    if (!passwordvalue.equals(repasswordvalue))
                    {
                        Toast.makeText(RegisterActivity.this, "Please check your password", Toast.LENGTH_LONG).show();
                    }
                    else if (passwordvalue.equals(repasswordvalue) && !DataBaseObject.exist(emailvalue))
                    {
                        DataBaseObject.AddNewUser(namevalue, emailvalue, passwordvalue);
                        Toast.makeText(RegisterActivity.this, "Registeration done!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }

                }  }});

    }
}