package com.csit.ramesh.csit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private FragmentPagerAdapter mPageAdapter;
    private ViewPager mViewpager;

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         mViewpager= (ViewPager) findViewById(R.id.container);

        mPageAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            private final Fragment[] mFragments = new Fragment[]
                    {

                            new fragment1(),
                            new fragment2(),
                            new fragment3(),
                            new fragment4(),
                    };
            private final String[] mFragmentsNames = new String[]{"Syllabus", "Notes","Questions","UserReview"};


            @Override
            public int getCount() {
                return mFragments.length;
            }

            @Override
            public Fragment getItem(int position) {
                return mFragments[position];

            }


            @Override
            public CharSequence getPageTitle(int position) {
               return mFragmentsNames[position];
            }
                };

        mViewpager.setAdapter(mPageAdapter);
        tabLayout= (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewpager);



       setupIcon();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setupIcon() {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_view_column_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_share_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow_drop_down_circle_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_person_black_24dp);


    }

}
