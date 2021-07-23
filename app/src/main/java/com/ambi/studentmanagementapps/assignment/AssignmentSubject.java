package com.ambi.studentmanagementapps.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.AssignmentSubjectAdapter;
import com.ambi.studentmanagementapps.adapter.LiveClassAdapter;

public class AssignmentSubject extends AppCompatActivity{
     RecyclerView recassignsub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_subject);

        recassignsub = (RecyclerView) findViewById(R.id.rec_assignsub);
        recassignsub.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"Hindi","English","Maths","Chemistry","Physics"};
        recassignsub.setAdapter(new AssignmentSubjectAdapter(this,data));
    }
}