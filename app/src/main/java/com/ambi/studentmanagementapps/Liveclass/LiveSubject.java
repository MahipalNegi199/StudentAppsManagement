package com.ambi.studentmanagementapps.Liveclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.LiveClassAdapter;

public class LiveSubject extends AppCompatActivity{
    RecyclerView reclivesub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_subject);

        reclivesub = (RecyclerView) findViewById(R.id.rec_livesub);
        reclivesub.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"Hindi","English","Maths","Chemistry","Physics"};
        reclivesub.setAdapter(new LiveClassAdapter(this,data));

    }
}