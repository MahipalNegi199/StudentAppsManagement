package com.ambi.studentmanagementapps.Examination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ambi.studentmanagementapps.R;

public class Examformat extends AppCompatActivity{
    TextView halfexam, yearexam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examformat);

        halfexam  = (TextView) findViewById(R.id.halfpaper);
        yearexam  = (TextView) findViewById(R.id.yearpaper);

        halfexam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ExamSchedule.class));
            }
        });

        yearexam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ExamSchedule.class));
            }
        });

    }
}