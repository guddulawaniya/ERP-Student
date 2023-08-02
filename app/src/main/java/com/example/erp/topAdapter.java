package com.example.erp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class topAdapter extends RecyclerView.Adapter<topAdapter.viewholder>{

    Context context;
    ArrayList<Topmodel> list;

    public topAdapter(Context context, ArrayList<Topmodel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.topstudentcard,parent ,false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Topmodel topmodel = list.get(position);
        holder.studentname.setText(topmodel.getStudentname());
        holder.adno.setText(topmodel.getAdno());
        holder.branch.setText(topmodel.getBranch());
        holder.belong.setText(topmodel.getBelong());
        holder.rank.setText(topmodel.getRank());
        holder.photo.setImageResource(topmodel.getImage());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView studentname,adno,branch,belong,rank;
        ImageView photo;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            studentname = itemView.findViewById(R.id.topsname);
            adno = itemView.findViewById(R.id.topano);
            branch = itemView.findViewById(R.id.topbranch);
            belong = itemView.findViewById(R.id.topbelog);
            rank = itemView.findViewById(R.id.toprankno);
            photo = itemView.findViewById(R.id.topsimage);
        }
    }
}
