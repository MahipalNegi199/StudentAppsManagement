package com.ambi.studentmanagementapps.Liveclass;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ambi.studentmanagementapps.R;


public class OnlineZoomClass extends AppCompatActivity{
    Button viewclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_zoom_class);

        viewclick = (Button) findViewById(R.id.viewclick);

        viewclick.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://zoom.us/"));
            startActivity(intent);
        });
    }
}