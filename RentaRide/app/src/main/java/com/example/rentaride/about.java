package com.example.rentaride;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class about extends AppCompatActivity {
    RecyclerView description;
    String s1 [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        description=findViewById(R.id.description);

        s1=getResources().getStringArray(R.array.Vehicle_Description);

       // Adapter adapter= new Adapter(this,s1);
        //description.setAdapter(adapter);
        description.setLayoutManager(new LinearLayoutManager(this));

    }
}