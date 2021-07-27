package com.example.rentaride;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class passwordconfirm extends AppCompatActivity {

     Button btnconfirmpass;
     TextView textView5,textView7,textView8;
     ImageView imageView4;
     EditText edittextpass1,edittextpass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwordconfirm);

        //Edittext
        edittextpass1=(EditText) findViewById(R.id.edittextpass1);
        edittextpass2=(EditText) findViewById(R.id.edittextpass2);

        //Textview
        textView5=(TextView) findViewById(R.id.textView5);
        textView7=(TextView) findViewById(R.id.textView7);
        textView8=(TextView) findViewById(R.id.textView8);
        //imageview
        imageView4=(ImageView) findViewById(R.id.imageView4);

        btnconfirmpass=(Button) findViewById(R.id.btnconfirmpass);
        btnconfirmpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {next();}
            });
    }

        public void next(){
            Intent intent= new Intent(this,home.class );
            startActivity(intent);

        }
}