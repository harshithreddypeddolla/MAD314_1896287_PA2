package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private EditText name,email,pass;
    private Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.editText3);
        email=findViewById(R.id.editText5);
        pass=findViewById(R.id.editText6);
        reg=findViewById(R.id.button2);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=name.getText().toString();
                String uemail=email.getText().toString();
                String upass=pass.getText().toString();
                if(uemail.equals("harshith@gmail.com")&&upass.equals("abcde")){
                    Toast.makeText(getApplicationContext(),"Registration Successfull",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
