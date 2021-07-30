package com.example.rentaride;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button btn_signup, btnLogin;
     ImageView imageView;
     TextView textuser,text_login,texttitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView= findViewById(R.id.imageView);

        //textview
        textuser=findViewById(R.id.textuser);
        text_login= findViewById(R.id.text_login);
        texttitle= findViewById(R.id.texttitle);



        btn_signup= findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();
            }
        });


        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogin();
            }
        });
    }

    public void opensignup(){
        Intent intent= new Intent(this,signup.class );
        startActivity(intent);

    }

    public void openlogin(){
        Intent intent= new Intent(this,login.class );
        startActivity(intent);

    }
}