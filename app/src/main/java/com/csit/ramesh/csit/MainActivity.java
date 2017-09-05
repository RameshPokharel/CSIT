package com.csit.ramesh.csit;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
List<Retrieve> list= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final  DrawerLayout drawerLayout= (DrawerLayout) findViewById(R.id.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.myRecycler);

        Retrieve retrieve1=new Retrieve("First Semester");
        list.add(retrieve1);
        Retrieve retriev2=new Retrieve("Second Semester");
        Retrieve retriev3=new Retrieve("Third Semester");
        Retrieve retriev4=new Retrieve("Fourth Semester");
        Retrieve retriev5=new Retrieve("Fifth Semester");
        Retrieve retriev6=new Retrieve("Sixth Semester");
        Retrieve retriev7=new Retrieve("Seventh Semester");
        Retrieve retriev8=new Retrieve("Eighth Semester");
        list.add(retriev2);
        list.add(retriev3);
        list.add(retriev4);
        list.add(retriev5);
        list.add(retriev6);
        list.add(retriev7);
        list.add(retriev8);
       // / recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));

       RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,2);


            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(new Semester_Adapter(list,this));



        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                item.setChecked(true);
                drawerLayout.closeDrawers();
                if (item.getItemId()==R.id.user)
                {

                    startActivity(new Intent(MainActivity.this,UserProfileActivity.class));
                 //  Toast.makeText(MainActivity.this,"checked",Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId()==R.id.home )

                {
                    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.activity_main);

                    drawer.closeDrawer(GravityCompat.START);
                }

                else if (item.getItemId() == R.id.share) {
                    Intent share = new Intent(android.content.Intent.ACTION_SEND);
                    share.setType("text/plain");
                    share.putExtra(android.content.Intent.EXTRA_SUBJECT, "my App");
                    share.putExtra(Intent.EXTRA_TEXT, " This is MY First App ");
                    startActivity(Intent.createChooser(share, "share via"));

                } else if (item.getItemId() == R.id.contact_us) {

                    startActivity(new Intent(MainActivity.this, contact_us.class));
                }
                return true;
            }
        });


    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.activity_main);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else
        {
            super.onBackPressed();
        }
    }

}
