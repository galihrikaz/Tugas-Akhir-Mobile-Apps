package com.example.ilmubahasainggris;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.ilmubahasainggris.LatihanSoal.LatihanSoal1Activity;

import java.util.ArrayList;
import java.util.List;

public class MenuLatihanActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_latihan);


        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Menu Latihan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            recyclerView = findViewById(R.id.rv);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(RecyclerView.VERTICAL);

            recyclerView.setLayoutManager(layoutManager);

            List<MenuLatihanModel> list = new ArrayList<>();
            list.add(new MenuLatihanModel("", "Latihan 1"));
            list.add(new MenuLatihanModel("", "Latihan 2"));
            list.add(new MenuLatihanModel("", "Latihan 3"));
            list.add(new MenuLatihanModel("", "Latihan 4"));
            list.add(new MenuLatihanModel("", "Latihan 5"));
            list.add(new MenuLatihanModel("", "Latihan 6"));
            list.add(new MenuLatihanModel("", "Latihan 7"));
            list.add(new MenuLatihanModel("", "Latihan 8"));


            MenuLatihanAdapter adapter = new MenuLatihanAdapter(list);
            recyclerView.setAdapter(adapter);

        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
