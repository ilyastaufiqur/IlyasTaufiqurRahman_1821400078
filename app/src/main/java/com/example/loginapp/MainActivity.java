package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText user,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btn_login);
        user = findViewById(R.id.ed_user);
        password = findViewById(R.id.ed_password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= login.getText().toString();
                String pass= password.getText().toString();


               switch (v.getId()) {

                   case R.id.btn_login:

                       if (TextUtils.isEmpty(username) | TextUtils.isEmpty(pass)) {
                           Toast.makeText(MainActivity.this, "mohon cek kembali data anda", Toast.LENGTH_SHORT).show();

                       } else{
                           Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                       startActivity(intent);
                       break;
               }
               }


            }
        });

    }
}
