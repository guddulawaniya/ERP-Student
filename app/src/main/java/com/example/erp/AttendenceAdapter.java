package com.example.erp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AttendenceAdapter extends RecyclerView.Adapter<AttendenceAdapter.viewholder> {


    ArrayList<AttendenceModel> list;
    Context context;

    public AttendenceAdapter(ArrayList<AttendenceModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.attendcard,parent,false);
        return  new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        AttendenceModel model = list.get(position);
        holder.coursecode.setText(model.getCoursecode());
        holder.coursename.setText(model.getCoursename());
        holder.total.setText(model.getTotal());
        holder.present.setText(model.getPresent());
        holder.faculty.setText(model.getFacultyname());

//        holder.rcode.setText(holder.coursecode.getText().toString());
//        int tt = Integer.parseInt(holder.total.getText().toString());
//        int pre = Integer.parseInt(holder.present.getText().toString());
//        holder.absent.setText(tt-pre);
//        int pro = (pre/tt)*100;
//        holder.progress.setText(pro);
//        holder.progressreal.setProgress(pro);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView coursecode,coursename,progress,total,present,absent,faculty,rcode;
        ProgressBar progressreal;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            coursecode = itemView.findViewById(R.id.ccode);
            coursename = itemView.findViewById(R.id.cname);
            rcode = itemView.findViewById(R.id.rccode);
            progress = itemView.findViewById(R.id.progress);
            total = itemView.findViewById(R.id.total);
            present = itemView.findViewById(R.id.present);
            absent = itemView.findViewById(R.id.absent);
            faculty = itemView.findViewById(R.id.facultyname);
            progressreal = itemView.findViewById(R.id.progressreal);

        }
    }
}
