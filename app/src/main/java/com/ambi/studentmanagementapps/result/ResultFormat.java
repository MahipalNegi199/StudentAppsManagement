package com.ambi.studentmanagementapps.result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ambi.studentmanagementapps.R;

public class ResultFormat extends AppCompatActivity{
    TextView halfresult,yearresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_format);

        halfresult = (TextView) findViewById(R.id.halfpaper);
        yearresult = (TextView) findViewById(R.id.yearpaper);

        halfresult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),StudentResult.class));
            }
        });

        yearresult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),StudentResult.class));
            }
        });
    }
}