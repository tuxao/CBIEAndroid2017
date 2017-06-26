package com.example.arthur.cbieandroid2017;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        fragment = new ScheduleFragment();

        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.content_container, fragment).commit();

        BottomNavigationView navigationBar = (BottomNavigationView) findViewById(R.id.navigation_bar);

        navigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.action_schedule:
                        fragment = new ScheduleFragment();
                        break;

                    case R.id.action_speakers:
                        fragment = new SpeakersFragment();
                        break;

                    case R.id.action_info:
                        fragment = new InfoFragment();
                        break;
                }

                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.content_container, fragment).commit();
                return true;
            }
        });

    }
}
