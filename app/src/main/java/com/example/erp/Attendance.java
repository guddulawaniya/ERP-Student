package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.erp.databinding.ActivityAttendanceBinding;

import java.util.ArrayList;

public class Attendance extends AppCompatActivity {

    ActivityAttendanceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAttendanceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<AttendenceModel> list = new ArrayList<>();

        binding.notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Attendance.this,notification_Activity.class);
                startActivity(intent);
            }
        });
        binding.attentmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Attendance.this,Message_Activity.class);
                startActivity(intent);
            }
        });
        binding.attentcalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Attendance.this,calender_Activity.class);
                startActivity(intent);
            }
        });
        binding.Attentback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        AttendenceAdapter adapter = new AttendenceAdapter(list,this);

        binding.subattentrecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL ,false));
        binding.subattentrecyclerview.setAdapter(adapter);
        list.add(new AttendenceModel("CSE301 - ","Compiler Design","80","50","Mr.Priyedarshi sir"));
        list.add(new AttendenceModel("CSE302 - ","Computer Network","70","40","Mrs.Deepti Gupta"));
        list.add(new AttendenceModel("CSE303 - ","Software Engineering ","50","30","Mrs. Swati Mam"));
        list.add(new AttendenceModel("CSE305 - ","Data Analysis of Algorithm","60","50","Dr.satish sir"));
        list.add(new AttendenceModel("CSE307 - ","Principal of programming Laugange","70","40","Mr.Priyedarshi sir"));
        list.add(new AttendenceModel("CSL305 - ","Cyber Security","20","10","Mr.Jitendra sir"));


    }
}