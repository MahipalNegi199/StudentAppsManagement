package com.ambi.studentmanagementapps.attendance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.PresentAbsentAdapter;

public class AttendanceList extends AppCompatActivity{
    RecyclerView preablist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_list);

        preablist = (RecyclerView) findViewById(R.id.preablist);
        preablist.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"01/03/21","03/03/21","05/03/21","02/03/21","04/03/21","07/03/21"};
        preablist.setAdapter(new PresentAbsentAdapter(this,data));


    }
}