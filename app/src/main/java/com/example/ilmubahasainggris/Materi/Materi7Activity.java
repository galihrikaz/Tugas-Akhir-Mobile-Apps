package com.example.ilmubahasainggris.Materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ilmubahasainggris.R;
import com.example.ilmubahasainggris.VideoMateri.VideoMateri7Activity;

public class Materi7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi7);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Judul 7");
        }

        Button btnvideo1 = findViewById(R.id.btn_video);
        btnvideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi7Activity.this, VideoMateri7Activity.class);
                startActivity(intent);
            }
        });
    }
}
