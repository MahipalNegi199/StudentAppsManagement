package com.ambi.studentmanagementapps.prequestionpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.AssignmentSubjectAdapter;
import com.ambi.studentmanagementapps.adapter.PaperSubjectAdapter;

public class SubjectPaperList extends AppCompatActivity{
    RecyclerView recpaperlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_paper_list);

        recpaperlist = (RecyclerView) findViewById(R.id.rec_prepaperlist);
        recpaperlist.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"Hindi","English","Maths","Chemistry","Physics"};
        recpaperlist.setAdapter(new PaperSubjectAdapter(this,data));
    }
}