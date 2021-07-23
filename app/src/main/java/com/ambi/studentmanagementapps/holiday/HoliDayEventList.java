package com.ambi.studentmanagementapps.holiday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.adapter.PublicHolidayAdapter;

public class HoliDayEventList extends AppCompatActivity{
    RecyclerView recpublic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holi_day_event_list);

        recpublic = (RecyclerView) findViewById(R.id.rec_holilist);
        recpublic.setLayoutManager(new LinearLayoutManager(this));
        String data [] = {"Event- Holi","Event- Eid","Event -Diwali","Event- abc"};
        String event [] = {"3/03/21-10/03/21","04/04/21-06/03/21","08/10/21-15/10/21","10/12/21-12/10/21"};
        String day [] = {"Monday","Wednesday","friday","Thursday","Tuesday"};
        recpublic.setAdapter(new PublicHolidayAdapter(data,event,day));
    }
}