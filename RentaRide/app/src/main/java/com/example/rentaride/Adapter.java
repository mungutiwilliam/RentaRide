package com.example.rentaride;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myviewholder> {
    List<String> s1;

    public Adapter(List<String> s1) {
        this.s1 = s1;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.my_row,parent, false);

        myviewholder myviewholder= new myviewholder(view);
        s1=new ArrayList<>();


        return myviewholder;
    }

    @Override
    public int getItemCount() {
        return s1.size();
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull myviewholder holder, int position) {

        holder.txt_atribute.setText(String.valueOf(position));
        holder.txt_atribute.setText(s1.get(position));

    }

    class myviewholder extends RecyclerView.ViewHolder{

        TextView txt_atribute,txtdescription;

        public myviewholder(@NonNull @NotNull View itemView) {
            super(itemView);

            txt_atribute=itemView.findViewById(R.id.txt_atribute);
            txtdescription=itemView.findViewById(R.id.txtdescription);


        }
    }


}
