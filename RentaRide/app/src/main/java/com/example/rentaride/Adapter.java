package com.example.rentaride;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.myviewholder> {

    String data[];
    Context context;

    public Adapter(Context ct,String s1[]){
        context=ct;
        data=s1;
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);


        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.myviewholder holder, int position) {
        holder.mytext.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        TextView mytext,mytext2;

        public myviewholder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            mytext=itemView.findViewById(R.id.txt_atribute);
            mytext2=itemView.findViewById(R.id.txtdescription);
        }
    }
}
