package com.example.ilmubahasainggris.MenuUtama;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ilmubahasainggris.MenuLatihanActivity;
import com.example.ilmubahasainggris.MenuMateriActivity;
import com.example.ilmubahasainggris.ProfilActivity;
import com.example.ilmubahasainggris.R;

public class MainActivity extends AppCompatActivity {
    Button btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnmateri = findViewById(R.id.btn_materi);
        btnmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MenuMateriActivity.class);
                startActivity(i);
            }
        });

        Button btnprofil = findViewById(R.id.btn_profil);
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(i);
            }
        });

        Button btnlatihan = findViewById(R.id.btn_latihan);
        btnlatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MenuLatihanActivity.class);
                startActivity(i);
            }
        });

        btnexit = findViewById(R.id.btn_logout);
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //memanggil alert exit
                showAlertDialog();
            }
        });

    }
    @Override
    public void onBackPressed(){
        //ketika tombol di klik akan keluar dialog alert
        //alert ini bukan untuk button layout tetapi untuk hape yang digunakan
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this )
                .setMessage("Apakah anda yakin ingin keluar dari aplikasi ini?")
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
