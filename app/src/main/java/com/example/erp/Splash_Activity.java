package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erp.databinding.ActivitySplashBinding;

public class Splash_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);


        ImageView imageView = findViewById(R.id.splashimage);
        TextView text1 = findViewById(R.id.sptext1);
        TextView text2 = findViewById(R.id.sptext2);
        View view = findViewById(R.id.spview);


        Animation imagerocket = AnimationUtils.loadAnimation(this,R.anim.image_animation);
        imageView.startAnimation(imagerocket);

        Animation viewanimation = AnimationUtils.loadAnimation(this,R.anim.image_animation);
        view.startAnimation(viewanimation);

        Animation appanimation1 = AnimationUtils.loadAnimation(this,R.anim.text_animation);
        text1.startAnimation(appanimation1);
        Animation appanimation2 = AnimationUtils.loadAnimation(this,R.anim.text_animation);
        text2.startAnimation(appanimation2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },2000);
    }
}