package com.ambi.studentmanagementapps.notes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.NotesSubjectAdapter;


public class NotesStudentSubject extends AppCompatActivity{
    RecyclerView recnotessub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_student_subject);

        recnotessub = (RecyclerView) findViewById(R.id.rec_sub_notes);
        recnotessub.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"Hindi","English","Maths","Chemistry","Physics"};
        recnotessub.setAdapter(new NotesSubjectAdapter(this,data));
    }
}