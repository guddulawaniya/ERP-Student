package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.erp.databinding.ActivityLoginBinding;

public class Login_Activity extends AppCompatActivity {

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.Loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!binding.email.getText().toString().isEmpty() && !binding.pass.getText().toString().isEmpty())
                {
                    Intent intent = new Intent(Login_Activity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (binding.email.getText().toString().isEmpty())
                {
                    binding.email.setError("Please Enter Email ");
                    binding.email.requestFocus();
                }
                else
                {
                    binding.pass.setError("please Enter the Password ");
                    binding.pass.requestFocus();
                }
            }
        });
    }
}