package com.example.ilmubahasainggris.Materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ilmubahasainggris.R;
import com.example.ilmubahasainggris.VideoMateri.VideoMateri4Activity;

public class Materi4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi4);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Judul 4");
        }


        Button btnvideo1 = findViewById(R.id.btn_video);
        btnvideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi4Activity.this, VideoMateri4Activity.class);
                startActivity(intent);
            }
        });
    }
}
