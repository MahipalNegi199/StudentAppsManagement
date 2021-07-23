package com.ambi.studentmanagementapps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ambi.studentmanagementapps.R;


public class PresentAbsentAdapter extends RecyclerView.Adapter<PresentAbsentAdapter.proHolder> {
    Context context;
    private String [] data;

    public PresentAbsentAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public proHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate(R.layout.presentabsent_list,parent,false);
        return new proHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull proHolder holder, int position) {
        String title = data[position];
        String title1 = data[position];
        String title2 = data[position];
        String title3 = data[position];
        String title4 = data[position];
        String title5 = data[position];
        holder.prefirst.setText(title);
        holder.presecond.setText(title1);
        holder.prethird.setText(title2);
        holder.abfirst.setText(title3);
        holder.absecond.setText(title4);
        holder.abthird.setText(title5);

    }

    @Override
    public int getItemCount()

    {
        return data.length;
    }

    public class proHolder extends RecyclerView.ViewHolder{

        TextView prefirst,presecond,prethird,abfirst,absecond,abthird;

        public proHolder(@NonNull View itemView) {
            super(itemView);
            prefirst = (TextView) itemView.findViewById(R.id.prefirst);
            presecond = (TextView) itemView.findViewById(R.id.presecond);
            prethird = (TextView) itemView.findViewById(R.id.prethird);
            abfirst = (TextView) itemView.findViewById(R.id.abfirst);
           absecond = (TextView) itemView.findViewById(R.id.absecond);
           abthird = (TextView) itemView.findViewById(R.id.abthird);




        }
    }

}
