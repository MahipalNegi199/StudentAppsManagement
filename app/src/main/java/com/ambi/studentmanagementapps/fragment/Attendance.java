package com.ambi.studentmanagementapps.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ambi.studentmanagementapps.Liveclass.LiveSubject;
import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.attendance.AttendanceList;


public class Attendance extends Fragment{
   Button btnsec;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 View view =  inflater.inflate(R.layout.fragment_attendance, container, false);

        btnsec = view.findViewById(R.id.btnsec);

        btnsec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), AttendanceList.class);
                startActivity(i);
            }
        });

        return view;
    }
}