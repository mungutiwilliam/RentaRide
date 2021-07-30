package com.example.rentaride;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Arrays;
import java.util.List;

public class about extends AppCompatActivity {
    RecyclerView description;
    Adapter adapter;
    List<String> s1;
    Toolbar toolbar4;
    ImageView imageView5;
    TextView title_desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        toolbar4=findViewById(R.id.toolbar4);

        imageView5=(ImageView) findViewById(R.id.imageView5);
        title_desc=(TextView) findViewById(R.id.title_desc);


        description=findViewById(R.id.description);

        s1= Arrays.asList(getResources().getStringArray(R.array.Vehicle_Description));

       Adapter adapter= new Adapter(s1);
        description.setLayoutManager(new LinearLayoutManager(this));
        description.setAdapter(adapter);

        s1.add("Name ");
        s1.add("Make ");
        s1.add("Type ");
        s1.add("Capacity ");
        s1.add("Transmission ");
        s1.add("Color ");
        s1.add("Price/Day ");
        s1.add("Status ");
        s1.add("TownID");
        s1.add("VehicleID");


    }
}