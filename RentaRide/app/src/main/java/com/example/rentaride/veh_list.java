package com.example.rentaride;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

public class veh_list extends AppCompatActivity {

    TextView textView30,title_toyota,txttrips2,textView31,txtCapacity3,textView32, txtTrips3, category_title,
            textView25,title_bmw,textView27,texviewCapacity,
            textView28,textviewTrips,honda39,textView29,txtCapacity;
    HorizontalScrollView all_scrollview,toyota_scrollview,honda_scrollview;
    CardView cview1,cview2,cview3,cview4,cview5, cview6,cview7,cview8,cview9;
    ImageView bmw_image,honda_image,toyota_image;
    Button btn_view, btn_view2,btn_view3,btn_view4,btn_view7,btn_view5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veh_list);

        textView30= findViewById(R.id.textView30);
        title_toyota= findViewById(R.id.title_toyota);
        txttrips2=findViewById(R.id.txttrips2);
        textView31= findViewById(R.id.textView31);
        textView27=findViewById(R.id.textView27);
        textView29=findViewById(R.id.textView29);
        textView28=findViewById(R.id.textView28);
        textView25=findViewById(R.id.textView25);
        title_bmw= findViewById(R.id.title_bmw);
        texviewCapacity=findViewById(R.id.texviewCapacity);
        textviewTrips=findViewById(R.id.textviewTrips);
        textView32= findViewById(R.id.textView32);
        txtCapacity3=findViewById(R.id.txtCapacity3);
        txtTrips3= findViewById(R.id.txtTrips3);
        category_title=findViewById(R.id.category_title);
        honda39=findViewById(R.id.honda39);
        txtCapacity=findViewById(R.id.txtCapacity);


        //Scrollview
        all_scrollview= findViewById(R.id.all_scrollview);
        toyota_scrollview= findViewById(R.id.toyota_scrollview);
        honda_scrollview=findViewById(R.id.honda_scrollview);


        //imageview
        bmw_image=findViewById(R.id.bmw_image);
        honda_image= findViewById(R.id.honda_image);
        toyota_image=findViewById(R.id.toyota_image);

        //cardview
        cview1= findViewById(R.id.cview1);
        cview2= findViewById(R.id.cview2);
        cview3=findViewById(R.id.cview3);
        cview4= findViewById(R.id.cview4);
        cview5=findViewById(R.id.cview5);
        cview6= findViewById(R.id.cview6);
        cview7=findViewById(R.id.cview7);
        cview8= findViewById(R.id.cview8);
        cview9=findViewById(R.id.cview9);

        //buttons
        btn_view= findViewById(R.id.btn_view);
        btn_view2=findViewById(R.id.btn_view2);
        btn_view3= findViewById(R.id.btn_view3);
        btn_view4= findViewById(R.id.btn_view4);
        btn_view5=findViewById(R.id.btn_view5);
        btn_view7= findViewById(R.id.btn_view7);
        btn_view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();

}


});
        btn_view2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();

            }


        });
        btn_view3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();

            }


        });
        btn_view4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();

            }


        });
        btn_view5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();

            }


        });
        btn_view7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();

            }


        });


    }

    public void openabout()
    {

        Intent intent= new Intent(this, about.class);
        startActivity(intent);
    }
}

