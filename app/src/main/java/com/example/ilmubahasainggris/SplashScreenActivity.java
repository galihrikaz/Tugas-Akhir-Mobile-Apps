package com.example.ilmubahasainggris;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.example.ilmubahasainggris.MenuUtama.MainActivity;

public class SplashScreenActivity extends AppCompatActivity {
    private int waktu_loading=2000;
    //6000= 6 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        loadingDialog = new Dialog(this);
//        loadingDialog.setContentView(R.layout.loading);
//        loadingDialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//        loadingDialog.setCancelable(false);
//        loadingDialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke MainActivity
                Intent menu = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(menu);
//                loadingDialog.dismiss();
                finish();
            }
        },waktu_loading);
    }
}
