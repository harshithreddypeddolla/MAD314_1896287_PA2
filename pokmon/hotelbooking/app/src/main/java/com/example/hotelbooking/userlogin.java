package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class userlogin extends AppCompatActivity {
    private TextView title;
    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        title = (TextView) findViewById(R.id.textView4);
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String upwd = password.getText().toString();
                if (uname.equals("harshith")&&upwd.equals("12345")){
                    Intent i = new Intent(userlogin.this,userpage.class);
                    startActivity(i);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrect Credentials",Toast.LENGTH_SHORT).show();
                }



            }
        });


    }
}
