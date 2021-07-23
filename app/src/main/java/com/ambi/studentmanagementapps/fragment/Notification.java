package com.ambi.studentmanagementapps.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.NotificationAdapter;


public class Notification extends Fragment{

   RecyclerView rv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_notification, container, false);

        rv = (RecyclerView) view.findViewById(R.id.recycler_item);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        String lang[] = {" Name : Aman Shakya \n Description : abc \n Date : 2/04/21","Name : Mahipal Singh \n Description : abc \n " +
                "Date : 3/04/21","Name : Rakesh \n Description : abc \n Date : 4/04/21","Name : Saurabh \n Description : " +
                "abc \n Date : 5/04/21"};
        rv.setAdapter(new NotificationAdapter(lang));

        return view;
    }
}