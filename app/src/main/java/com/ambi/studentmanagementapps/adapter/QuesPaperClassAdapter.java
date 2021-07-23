package com.ambi.studentmanagementapps.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.ambi.studentmanagementapps.Liveclass.OnlineZoomClass;
import com.ambi.studentmanagementapps.R;
import com.ambi.studentmanagementapps.prequestionpaper.PrePaperformat;
import com.ambi.studentmanagementapps.prequestionpaper.SubjectPaperList;


public class QuesPaperClassAdapter extends RecyclerView.Adapter<QuesPaperClassAdapter.proHolder> {
    Context context;
    private String [] data;

    public QuesPaperClassAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public proHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate(R.layout.prequespaperclass_list,parent,false);
        return new proHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull proHolder holder, int position) {
        String title = data[position];
        holder.textView.setText(title);


        holder.cl31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, PrePaperformat.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()

    {
        return data.length;
    }

    public class proHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ConstraintLayout cl31;
        public proHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.pre_classpaper);
            cl31 = itemView.findViewById(R.id.cl31);


        }
    }

}

