package com.ambi.studentmanagementapps.prequestionpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.LiveClassAdapter;
import com.ambi.studentmanagementapps.adapter.QuesPaperClassAdapter;

public class PreQuestionPaperClass extends AppCompatActivity{
    RecyclerView recpprepaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_question_paper_class);

        recpprepaper = (RecyclerView) findViewById(R.id.rec_preclasspaper);
        recpprepaper.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"Hindi","English","Maths","Chemistry","Physics"};
        recpprepaper.setAdapter(new QuesPaperClassAdapter(this,data));

    }
}