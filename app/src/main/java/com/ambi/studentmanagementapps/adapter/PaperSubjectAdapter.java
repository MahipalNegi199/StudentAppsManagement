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


public class PaperSubjectAdapter extends RecyclerView.Adapter<PaperSubjectAdapter.proHolder> {
    Context context;
    private String [] data;

    public PaperSubjectAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public proHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate(R.layout.prepaper_list,parent,false);
        return new proHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull proHolder holder, int position) {
        String title = data[position];
        holder.textView.setText(title);

    }

    @Override
    public int getItemCount()

    {
        return data.length;
    }

    public class proHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ConstraintLayout cl32;
        public proHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.ques_subject);
            cl32 = itemView.findViewById(R.id.cl32);


        }
    }

}

