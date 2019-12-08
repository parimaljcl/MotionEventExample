package com.example.motioneventexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_my_image_view);
        setContentView(new MyImageView(this));
    }
}
