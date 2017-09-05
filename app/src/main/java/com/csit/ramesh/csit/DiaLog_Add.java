package com.csit.ramesh.csit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DiaLog_Add extends AppCompatActivity {
EditText bookName,fileName;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dia_log__add);



        bookName= (EditText) findViewById(R.id.BookName);
        fileName= (EditText) findViewById(R.id.pdf);
        add= (Button) findViewById(R.id.Add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Bname=bookName.getText().toString();
                 String pdf=fileName.getText().toString();

                User_add_Item user_add_item10=new  User_add_Item(Bname,pdf);

                List<User_add_Item> list=new ArrayList<>();


                list.add(user_add_item10);

              //  Intent intent = new Intent()

              //  DiaLog_Add.super.onBackPressed();
            }
        });
    }
}
