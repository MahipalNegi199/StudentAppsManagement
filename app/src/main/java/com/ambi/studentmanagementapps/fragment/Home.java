package com.ambi.studentmanagementapps.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ambi.studentmanagementapps.Examination.Examformat;
import com.ambi.studentmanagementapps.Liveclass.LiveSubject;
import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.assignment.AssignmentSubject;
import com.ambi.studentmanagementapps.feesdetails.StudentFee;
import com.ambi.studentmanagementapps.holiday.HoliCalendar;
import com.ambi.studentmanagementapps.notes.NotesStudentSubject;
import com.ambi.studentmanagementapps.prequestionpaper.PreQuestionPaperClass;
import com.ambi.studentmanagementapps.profile.StudentProfile;
import com.ambi.studentmanagementapps.recordedvideo.RecordedClass;
import com.ambi.studentmanagementapps.recordedvideo.RecordedVideo;
import com.ambi.studentmanagementapps.result.ResultFormat;


public class Home extends Fragment{

    CardView salarycard,resultcard ,profilecard,liveclass,videocard,assigncard,examcard, cardholi,notescard,prepapercard;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_home, container, false);

        liveclass = view.findViewById(R.id.liveclass);
        salarycard = view.findViewById(R.id.salarycard);
        resultcard = view.findViewById(R.id.resultcard);
        profilecard = view.findViewById(R.id.profilecard);
        videocard = view.findViewById(R.id.videocard);
        assigncard = view.findViewById(R.id.asigncard);
        examcard = view.findViewById(R.id.examcard);
        cardholi = view.findViewById(R.id.holicard);
        notescard = view.findViewById(R.id.notescard);
        prepapercard = view.findViewById(R.id.prepapercard);

        liveclass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), LiveSubject.class);
                startActivity(i);
            }
        });

       profilecard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), StudentProfile.class);
                startActivity(i);
            }
        });
        examcard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Examformat.class);
                startActivity(i);
            }
        });

        resultcard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ResultFormat.class);
                startActivity(i);
            }
        });

        videocard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), RecordedClass.class);
                startActivity(i);
            }
        });


       salarycard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), StudentFee.class);
                startActivity(i);
            }
        });

        assigncard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), AssignmentSubject.class);
                startActivity(i);
            }
        });

        cardholi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), HoliCalendar.class);
                startActivity(i);
            }
        });

        notescard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), NotesStudentSubject.class);
                startActivity(i);
            }
        });

        prepapercard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), PreQuestionPaperClass.class);
                startActivity(i);
            }
        });



        return view;
    }


}