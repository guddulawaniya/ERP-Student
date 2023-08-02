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


public class maineAdapter extends RecyclerView.Adapter<maineAdapter.viewholder> {

    ArrayList<mainemodel> list;
    Context context;

    public maineAdapter(ArrayList<mainemodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.gridlayoutmainefile, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        mainemodel model = list.get(position);
        holder.stimage.setImageResource(model.getStimage());
        holder.stname.setText(model.getName());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView stname;
        ImageView stimage;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            stname = itemView.findViewById(R.id.studentname);
            stimage = itemView.findViewById(R.id.stpic);
        }
    }
}