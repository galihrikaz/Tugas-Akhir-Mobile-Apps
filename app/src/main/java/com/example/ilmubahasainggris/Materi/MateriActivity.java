package com.example.ilmubahasainggris.Materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ilmubahasainggris.R;
import com.example.ilmubahasainggris.VideoMateri.VideoMateri1Activity;

public class MateriActivity extends AppCompatActivity {
    private static final String TAG ="MateriActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        Log.d(TAG,"onCreate: started");

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Judul 1");
        }


        Button btnvideo1 = findViewById(R.id.btn_video);
        btnvideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MateriActivity.this, VideoMateri1Activity.class);
                startActivity(intent);
            }
        });


    }
}
