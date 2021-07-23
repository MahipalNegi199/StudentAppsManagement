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
import com.ambi.studentmanagementapps.recordedvideo.RecordedVideo;


public class RecordSubjectAdapter extends RecyclerView.Adapter<RecordSubjectAdapter.proHolder> {
    Context context;
    private String [] data;

    public RecordSubjectAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public proHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate(R.layout.recordsubject_list,parent,false);
        return new proHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull proHolder holder, int position) {
        String title = data[position];
        holder.textView.setText(title);


        holder.cl2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, RecordedVideo.class);
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
        ConstraintLayout cl2;
        public proHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.recorded_sub);
            cl2 = itemView.findViewById(R.id.cl2);


        }
    }

}
