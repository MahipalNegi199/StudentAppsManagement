package com.ambi.studentmanagementapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.ambi.studentmanagementapps.fragment.Attendance;
import com.ambi.studentmanagementapps.fragment.Home;
import com.ambi.studentmanagementapps.fragment.Notification;
import com.ambi.studentmanagementapps.fragment.TimeTable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity{

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer, new Home()).commit();
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.item1:
                        selectedFragment = new Home();
                        break;

                        case R.id.item2:
                        selectedFragment = new TimeTable();
                        break;
                    case R.id.item3:
                        selectedFragment = new Attendance();
                        break;

                    case R.id.item4:
                        selectedFragment = new Notification();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer, selectedFragment).commit();
                return true;
            }
        });
    }
    //____________________________on create method close_________________________


    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option, menu);
        return true;

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                Intent intent = new Intent(Dashboard.this, Setting.class);
                startActivity(intent);
                return true;

            case R.id.logout:
                Intent in = new Intent(Dashboard.this, Logout.class);
                startActivity(in);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
