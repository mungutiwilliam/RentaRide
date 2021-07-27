package com.example.rentaride;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {

    TextView txt_title,textid,txt_pass;
    ImageView imageView2;
    EditText editid,editPass;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //imageview
        imageView2=(ImageView) findViewById(R.id.imageView2);

        //Edittext
        editid=(EditText) findViewById(R.id.editid);
        editPass=(EditText) findViewById(R.id.editPass);

        //textview
        txt_title= (TextView) findViewById(R.id.txt_title);
        textid= (TextView) findViewById(R.id.textid);
        txt_pass=(TextView) findViewById(R.id.txt_pass);

        //button
        btnlogin=(Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });

    }

    public void openhome(){
        Intent intent= new Intent(this,home.class );
        startActivity(intent);

    }
}