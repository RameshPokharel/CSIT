package com.csit.ramesh.csit;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramesh on 2/25/2017.
 */

public class Semester_Adapter extends RecyclerView.Adapter<Semester_Adapter.viewHolder> {
    Context context;
    List<Retrieve> retrieve = new ArrayList<>();


    Semester_Adapter(List<Retrieve> retrieves, Context context)
    {
        this.retrieve=retrieves;
        this.context =context;

    }


    @Override
    public Semester_Adapter.viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.semester,parent,false);
        return  new viewHolder(item);
    }



    @Override
    public void onBindViewHolder(viewHolder holder, final int position) {
         Retrieve retrieve1 = retrieve.get(position);
        holder.textView.setText(retrieve1.name);
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=  new Intent(context,Main3Activity.class);
               context.startActivity(intent);
                 }
        });




    }


    @Override
    public int getItemCount() {
        return retrieve.size();
    }



    public  class viewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        LinearLayout linearlayout;
        public viewHolder(View itemView) {
            super(itemView);
            linearlayout= (LinearLayout) itemView.findViewById(R.id.l1);

            textView= (TextView) itemView.findViewById(R.id.semester);
        }
    }
}
