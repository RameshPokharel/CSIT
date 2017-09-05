package com.csit.ramesh.csit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static java.lang.Thread.sleep;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh);
/*
        new Thread()
        {
            @Override
            public void run() {
                try{
                    sleep(3000);
                    startActivity(new Intent(contact_us.this,MainActivity.class));
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }.start();
*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    startActivity(new Intent(splash.this,MainActivity.class));
                    finish();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
