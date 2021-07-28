package com.example.rentaride;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class signup extends AppCompatActivity implements View.OnClickListener {

    Button btn_next;
    ScrollView scrollview2;
    ImageView imageView3;
    TextView textView4,textView12,textView9,textView10,textView11,textView13,textView14,txtemail,txt_gender;
    EditText textphonenumber, textDLNumber, textIDNumb,textsname,textfname,edtext_email;

    FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        db= FirebaseFirestore.getInstance();

        //imageview
        imageView3=(ImageView) findViewById(R.id.imageView3);
        //Scrollview
        scrollview2=(ScrollView) findViewById(R.id.scrollView2);
        //textview
        textView4=(TextView) findViewById(R.id.textView4);
        textView12=(TextView) findViewById(R.id.textView12);
        textView9=(TextView) findViewById(R.id.textView9);
        textView10=(TextView) findViewById(R.id.textView10);
        textView11=(TextView) findViewById(R.id.textView11);
        textView14=(TextView) findViewById(R.id.textView14);
        textView13=(TextView) findViewById(R.id.textView13);

        //edittext
        textfname=(EditText) findViewById(R.id.textfname);
        textsname=(EditText) findViewById(R.id.textsname);
        textIDNumb=(EditText) findViewById(R.id.textIDNumb);
        textDLNumber=(EditText) findViewById(R.id.textDLNumber);
        textphonenumber=(EditText) findViewById(R.id.textphonenumber);
        edtext_email=(EditText) findViewById(R.id.edtext_email);


        //button
        btn_next=(Button) findViewById(R.id.btn_next);

    }
    private boolean validateinputs(String fname, String sname, String IDnum, String DLnum,String phonenum, String email){
        if (fname.isEmpty()){
            textfname.setError("Firstname is required");
            return true;
        }
        if (sname.isEmpty()){
            textsname.setError("Surname is required");
            return true;
        }
        if (IDnum.isEmpty()){
            textIDNumb.setError("ID Number is required");
            return true;
        }
        if (DLnum.isEmpty()){
            textDLNumber.setError("Driving Licence Number is required");
            return true;
        }
        if (phonenum.isEmpty()){
            textphonenumber.setError("Phone Number is required");
            return true;
        }
        if (email.isEmpty()){
            edtext_email.setError("Email is required");
            return true;
        }

        return false;
    }



    public void onClick(View view){
        String fname=textfname.getText().toString().trim();
        String sname=textsname.getText().toString().trim();
        String IDnum=textIDNumb.getText().toString().trim();
        String DLnum=textDLNumber.getText().toString().trim();
        String phonenum=textphonenumber.getText().toString().trim();
        String email = edtext_email.getText().toString().trim();

        if (!validateinputs(fname,sname,IDnum,DLnum,phonenum,email)){
            CollectionReference dbusers=db.collection("users");
            userhelper user = new userhelper(fname,sname,Double.parseDouble(IDnum),Double.parseDouble(DLnum),Double.parseDouble(phonenum),email);

            dbusers.add(user).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                @Override
                public void onSuccess(DocumentReference documentReference) {
                    Toast.makeText(signup.this,"New  User added", Toast.LENGTH_LONG).show();
                    opennext();

                }
            });

        }




    }
    public void opennext(){
        Intent intent= new Intent(this,passwordconfirm.class );
        startActivity(intent);

    }
}