package com.csit.ramesh.csit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class UserProfileActivity extends AppCompatActivity {

    Button userProfileAddButton;
    RecyclerView userProfileRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        userProfileAddButton= (Button) findViewById(R.id.user_profile_add_button);
        userProfileRecycler= (RecyclerView) findViewById(R.id.user_profile_recycler);



        List<User_add_Item> list=new ArrayList<>();


        User_add_Item user_add_item=new User_add_Item("sub1","pdf1");
        User_add_Item user_add_item2=new User_add_Item("sub2","pdf2");
        User_add_Item user_add_item3=new User_add_Item("sub3","pdf3");
        User_add_Item user_add_item4=new User_add_Item("sub4","pdf4");
        User_add_Item user_add_item5=new User_add_Item("sub5","pdf5");
        User_add_Item user_add_item6=new User_add_Item("sub6","pdf6");
        User_add_Item user_add_item7=new User_add_Item("sub7","pdf7");
        User_add_Item user_add_item8=new User_add_Item("sub8","pdf8");

        list.add(user_add_item);
        list.add(user_add_item2);
        list.add(user_add_item3);
        list.add(user_add_item4);
        list.add(user_add_item5);
        list.add(user_add_item6);
        list.add(user_add_item7);
        list.add(user_add_item8);


       RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(UserProfileActivity.this,LinearLayoutManager.VERTICAL,false);
        userProfileRecycler.setLayoutManager(layoutManager);
        userProfileRecycler.setItemAnimator(new DefaultItemAnimator());
       userProfileRecycler.setAdapter(new UserAddNoteAdapter(list,this));





        userProfileAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfileActivity.this,DiaLog_Add.class));
            }
        });

    }
}
