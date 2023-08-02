package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import com.example.erp.databinding.ActivityCalenderBinding;

public class calender_Activity extends AppCompatActivity {

    ActivityCalenderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalenderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}