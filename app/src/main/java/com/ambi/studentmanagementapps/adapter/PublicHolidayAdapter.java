package com.ambi.studentmanagementapps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ambi.studentmanagementapps.R;


public class PublicHolidayAdapter extends RecyclerView.Adapter<PublicHolidayAdapter.proHolder> {
    Context context;
    private String [] data;
    private  String [] event;
    private String []  day;
    public PublicHolidayAdapter(String [] data, String [] event, String [] day)
    {
        this.data = data;
        this.event = event;
        this.day = day;
    }
    @NonNull
    @Override
    public proHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate(R.layout.publicholiday_lidt,parent,false);
        return new proHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull proHolder holder, int position) {
        String title = data[position];
        String title1 = day[position];
        String title2 = event[position];
        holder.pholi1.setText(title);
        holder.day.setText(title1);
        holder.pholi2.setText(title2);

    }

    @Override
    public int getItemCount()

    {
        return data.length;
    }

    public class proHolder extends RecyclerView.ViewHolder{

        TextView pholi1,pholi2, day;

        public proHolder(@NonNull View itemView) {
            super(itemView);
            pholi1 = (TextView) itemView.findViewById(R.id.pholi1);
            day = (TextView) itemView.findViewById(R.id.day);
            pholi2 = (TextView) itemView.findViewById(R.id.pholi2);



        }
    }

}
