package com.example.rentaride;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;


public class VehCategory extends AppCompatActivity {
    Toolbar toolbar2;
    TextView textView15,textView19,textView20,textView21,textView22;
    ImageButton suvbtn,btnTruck,saloonbtn,btnbike;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veh_category);

        toolbar2=findViewById(R.id.toolbar);
        textView15=findViewById(R.id.textView15);
        textView19=findViewById(R.id.textView19);
        textView20= findViewById(R.id.textView20);
        textView21= findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);

        suvbtn=  findViewById(R.id.suvbtn);
        suvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openlist();
            }
        });

        btnTruck= findViewById(R.id.btnTruck);
        btnTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openlist();
            }
        });

        saloonbtn= findViewById(R.id.saloonbtn);
        saloonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openlist();
            }
        });

        btnbike= findViewById(R.id.btnbike);
        btnbike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openlist();
            }
        });
    }

    public void openlist()
    {

        Intent intent= new Intent(this, about.class);
        startActivity(intent);
    }
}