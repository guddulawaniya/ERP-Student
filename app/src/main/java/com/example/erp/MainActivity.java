package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.erp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        ArrayList<Topmodel> list = new ArrayList<>();

        topAdapter adapter = new topAdapter(this, list);
        binding.toprecyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.toprecyclerview.setAdapter(adapter);
        list.add(new Topmodel("Guddu kumar", "2000430", "CSE [AI & ml", "Mathura", "#1",R.drawable.ime2));
        list.add(new Topmodel("Manish kumar", "2000555", "CSE [AI & ml", "Fetahpur", "#2",R.drawable.ima2));
        list.add(new Topmodel("Anand kumar", "2000120", "CSE [AI & ml", "Bihar", "#3",R.drawable.ime2));
        list.add(new Topmodel("Vivek Yadav", "2000032", "CSE [AI & ml", "Agra", "#4",R.drawable.img3));
        list.add(new Topmodel("Soyab Khan", "2000254", "CSE [AI & ml", "Kosi kalan", "#5",R.drawable.sanskritiimage));

        binding.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this,calender_Activity.class);
                startActivity(intent);
            }
        });
        binding.sanskribanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,webview_Activity.class);
                intent.putExtra("link","https://www.sanskriti.edu.in/");
                startActivity(intent);
            }
        });
        binding.linearLayout101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,subjects_Activity.class);
                startActivity(intent);
            }
        });
        binding.linearLayout103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,webview_Activity.class);
                intent.putExtra("link","https://www.sanskriti.edu.in/media/events.php");
                startActivity(intent);
            }
        });

        binding.Attedencelinerlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Attendance.class);
                startActivity(intent);
            }
        });

        binding.profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profile_Activity.class);
                startActivity(intent);
            }
        });
    }
}