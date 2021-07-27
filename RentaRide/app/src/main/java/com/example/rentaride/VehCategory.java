package com.example.rentaride;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;


public class VehCategory extends AppCompatActivity {
    Toolbar toolbar2;
    TextView textView15,textView19,textView20,textView21,textView22;
    ImageButton suvbtn,btnTruck,saloonbtn,btnbike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veh_category);
        textView15=(TextView) findViewById(R.id.textView15);
        textView19=(TextView) findViewById(R.id.textView19);
        textView20=(TextView) findViewById(R.id.textView20);
        textView21=(TextView) findViewById(R.id.textView21);
        textView22=(TextView) findViewById(R.id.textView22);

        suvbtn= (ImageButton) findViewById(R.id.suvbtn);
        suvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlist();
            }
        });

        btnTruck= (ImageButton) findViewById(R.id.btnTruck);
        btnTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlist();
            }
        });

        saloonbtn= (ImageButton) findViewById(R.id.saloonbtn);
        saloonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlist();
            }
        });

        btnbike= (ImageButton) findViewById(R.id.btnbike);
        btnbike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlist();
            }
        });
    }

    public void openlist()
    {

        Intent intent= new Intent(this, about.class);
    }
}