package com.example.rentaride;

import android.content.Intent;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

public class home extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton btnNairobi,btnkisumu, btnNakuru, btnmombasa;
    TextView textView16, textView17, textView18;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar=findViewById(R.id.toolbar);
        textView16=findViewById(R.id.textView16);
        textView17=findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);

        btnNairobi=findViewById(R.id.btnNairobi);
        btnNairobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                opennext();
            }
        });

        btnkisumu=findViewById(R.id.btnkisumu);
        btnkisumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                opennext();
            }
        });
        btnNakuru= findViewById(R.id.btnNakuru);
        btnNakuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                opennext();
            }
        });

        btnmombasa=  findViewById(R.id.btnmombasa);
        btnmombasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                opennext();
            }
        });
        
    }
    public void opennext()
    {
        Intent intent= new Intent(this, VehCategory.class);
    }
}