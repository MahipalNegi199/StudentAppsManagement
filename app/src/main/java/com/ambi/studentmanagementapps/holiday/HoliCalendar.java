package com.ambi.studentmanagementapps.holiday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ambi.studentmanagementapps.R;

public class HoliCalendar extends AppCompatActivity{
   Button btnfirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holi_calendar);

        btnfirst = (Button) findViewById(R.id.btnfirst);

        btnfirst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),HoliDayEventList.class));
            }
        });


    }
}