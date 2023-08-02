package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.erp.databinding.ActivitySubjectsBinding;

import java.util.ArrayList;

public class subjects_Activity extends AppCompatActivity {

    ActivitySubjectsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubjectsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<AttendenceModel> list = new ArrayList<>();
        binding.subjectback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        subjectAdapter adapter = new subjectAdapter(list,this);
        binding.subjectrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.subjectrecyclerview.setAdapter(adapter);
        list.add(new AttendenceModel(R.drawable.ima2));
        list.add(new AttendenceModel(R.drawable.ime2));
        list.add(new AttendenceModel(R.drawable.image3));
        list.add(new AttendenceModel(R.drawable.image4));
        list.add(new AttendenceModel(R.drawable.image5));
        list.add(new AttendenceModel(R.drawable.image6));
        list.add(new AttendenceModel(R.drawable.image7));
        list.add(new AttendenceModel(R.drawable.image8));





    }
}