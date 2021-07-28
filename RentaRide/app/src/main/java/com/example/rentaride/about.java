package com.example.rentaride;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class about extends AppCompatActivity {
    RecyclerView description;
    String[] s1;
    Toolbar toolbar4;
    ImageView imageView5;
    TextView title_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        imageView5=(ImageView) findViewById(R.id.imageView5);
        title_desc=(TextView) findViewById(R.id.title_desc);


        description=findViewById(R.id.description);

        s1=getResources().getStringArray(R.array.Vehicle_Description);

       Adapter adapter= new Adapter(this,s1);
        description.setAdapter(adapter);
        description.setLayoutManager(new LinearLayoutManager(this));

    }
}