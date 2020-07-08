package com.example.ilmubahasainggris.VideoMateri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ilmubahasainggris.R;

public class VideoMateri5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_materi5);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Video 5");
        }
    }
}
