package com.example.ilmubahasainggris.Materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ilmubahasainggris.R;
import com.example.ilmubahasainggris.VideoMateri.VideoMateri8Activity;

public class Materi8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi8);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Judul 8");
        }

        Button btnvideo1 = findViewById(R.id.btn_video);
        btnvideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi8Activity.this, VideoMateri8Activity.class);
                startActivity(intent);
            }
        });
    }
}
