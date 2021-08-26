package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.*;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SignUpBtn = (Button)findViewById(R.id.RegActivitybutton);
        Button loginbtn = (Button)findViewById(R.id.LogInBtn);
        final  EditText Email_Text = (EditText) findViewById(R.id.emailtext);
        final EditText Password_Text = (EditText) findViewById(R.id.passwordtext);
        final  DataBaseclass DataBaseObject = new DataBaseclass(this);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailvalue = Email_Text.getText().toString();
                String passwordvalue = Password_Text.getText().toString();

                if (emailvalue.equals("")|| passwordvalue.equals("") ){
                    Toast.makeText(MainActivity.this,"Please enter all the fields",Toast.LENGTH_LONG).show();
                }
                else {
                    boolean found = DataBaseObject.loginCheck(emailvalue, passwordvalue);
                    Email_Text.getText().clear();
                    Password_Text.getText().clear();

                    if (found) {
                        Toast.makeText(MainActivity.this,"logged in successfully",Toast.LENGTH_LONG).show();
                        //logged in successfully
                        if(emailvalue.equals("Admin@gmail.com")&& passwordvalue.equals(1111)){
                            Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                            startActivity(intent);
                        }
                    }
                    else if (!found)
                    {
                        Toast.makeText(MainActivity.this,"invalid email or password",Toast.LENGTH_LONG).show();
                    }

                }
            }
        });
        // moving to the registration page
        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomaActivity.class);
                startActivity(intent);
            } });
    }
}