package com.ambi.studentmanagementapps.prequestionpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ambi.studentmanagementapps.R;

public class PrePaperformat extends AppCompatActivity{
   TextView halfpaper,yearpaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_paperformat);

        halfpaper = (TextView) findViewById(R.id.halfpaper);
       yearpaper = (TextView) findViewById(R.id.yearpaper);

       halfpaper.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),SubjectPaperList.class));
           }
       });

        yearpaper.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SubjectPaperList.class));
            }
        });

    }
}