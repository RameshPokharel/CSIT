package com.csit.ramesh.csit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Ramesh on 2/28/2017.
 */

public class UserAddNoteAdapter extends RecyclerView.Adapter<UserAddNoteAdapter.ViewHolder> {

    List<User_add_Item> list = new ArrayList<>();
    Context context;

     UserAddNoteAdapter(List<User_add_Item> list, Context context)
     {

         this.list=list;
         this.context=context;

     }
    @Override
    public UserAddNoteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view=  LayoutInflater.from(parent.getContext()).inflate(R.layout.user_profile_posted_note_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        User_add_Item user_add_item1=list.get(position);
        holder.SubjectName.setText(user_add_item1.BookName);
        holder.pdfFile.setText(user_add_item1.PdfName);





    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView SubjectName,pdfFile;
        Button delete;
        public ViewHolder(View itemView) {
            super(itemView);
            SubjectName= (TextView) itemView.findViewById(R.id.SubjetId);
            pdfFile= (TextView) itemView.findViewById(R.id.pdf);
            delete= (Button) itemView.findViewById(R.id.delete);

        }
    }

}
