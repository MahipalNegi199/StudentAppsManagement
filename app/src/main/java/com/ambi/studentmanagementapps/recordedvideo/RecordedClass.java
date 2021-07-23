package com.ambi.studentmanagementapps.recordedvideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.LiveClassAdapter;
import com.ambi.studentmanagementapps.adapter.RecordSubjectAdapter;

public class RecordedClass extends AppCompatActivity{
    RecyclerView recrecordsub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recorded_class);

       recrecordsub = (RecyclerView) findViewById(R.id.rec_recordedsub);
        recrecordsub.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"Hindi","English","Maths","Chemistry","Physics"};
        recrecordsub.setAdapter(new RecordSubjectAdapter(this,data));

    }
}