package com.example.ilmubahasainggris.VideoMateri;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.ilmubahasainggris.R;

import org.w3c.dom.Text;

public class VideoMateri1Activity extends AppCompatActivity {
    MediaController media_Controller;
    DisplayMetrics dm;

    VideoView videoViewSaya;
    TextView v_judul;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_materi1);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Video 1");
        }

//        v_judul = (TextView) findViewById(R.id.v_judul1);
//        v_judul = (TextView) findViewById(R.id.v_judul2);
//        v_judul = (TextView) findViewById(R.id.v_judul3);
//
//        videoViewSaya = (VideoView) findViewById(R.id.video1);
//        videoViewSaya = (VideoView) findViewById(R.id.video2);
//        videoViewSaya = (VideoView) findViewById(R.id.video3);
//
//        media_Controller = new MediaController(this);
//        dm = new DisplayMetrics();
//
//        // ambil ukuran layar
//        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
//        int height = dm.heightPixels;
//        int width = dm.widthPixels;
//
//        // lebar dan tinggi video view diberi nilai agar menyesuaikan ukuran layout
//        videoViewSaya.setMinimumWidth(width);
//        videoViewSaya.setMinimumHeight(height);
//
//        // kontroler video
//        videoViewSaya.setMediaController(media_Controller);


    }
}

