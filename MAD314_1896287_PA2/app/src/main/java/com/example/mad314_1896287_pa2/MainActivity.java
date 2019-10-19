package com.example.mad314_1896287_pa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText id, password;
    Button login;
    Integer id1=1;
    String pass="ram";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      id =findViewById(R.id.et1);
       password =findViewById(R.id.et2);
       login=findViewById(R.id.button);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               int sid = Integer.parseInt(id.getText().toString());
               String spass = password.getText().toString();

               if (id1.equals(sid) & pass.equals(spass)) {
                   Intent z = new Intent(MainActivity.this, secondpage.class);
                   startActivity(z);
               }
           }
       });


    }
}
