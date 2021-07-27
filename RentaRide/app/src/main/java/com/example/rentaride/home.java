package com.example.rentaride;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toolbar;

public class home extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton btnNairobi,btnkisumu, btnNakuru, btnmombasa;
    TextView textView16, textView17, textView18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textView16=(TextView) findViewById(R.id.textView16);
        textView17=(TextView) findViewById(R.id.textView17);
        textView18=(TextView) findViewById(R.id.textView18);

        btnNairobi= (ImageButton) findViewById(R.id.btnNairobi);
        btnNairobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              opennext();  
            }
        });

        btnkisumu= (ImageButton) findViewById(R.id.btnkisumu);
        btnkisumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennext();
            }
        });
        btnNakuru= (ImageButton) findViewById(R.id.btnNakuru);
        btnNakuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennext();
            }
        });

        btnmombasa= (ImageButton) findViewById(R.id.btnmombasa);
        btnmombasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennext();
            }
        });
        
    }
    public void opennext()
    {
        Intent intent= new Intent(this, VehCategory.class);
    }
}