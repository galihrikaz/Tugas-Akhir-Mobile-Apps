package com.example.ilmubahasainggris;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MenuMateriActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materi);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Menu Materi");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            recyclerView = findViewById(R.id.rv);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(RecyclerView.VERTICAL);

            recyclerView.setLayoutManager(layoutManager);

            List<MenuMateriModel> list = new ArrayList<>();
            list.add(new MenuMateriModel("", "Materi 1"));
            list.add(new MenuMateriModel("", "Materi 2"));
            list.add(new MenuMateriModel("", "Materi 3"));
            list.add(new MenuMateriModel("", "Materi 4"));
            list.add(new MenuMateriModel("", "Materi 5"));
            list.add(new MenuMateriModel("", "Materi 6"));
            list.add(new MenuMateriModel("", "Materi 7"));
            list.add(new MenuMateriModel("", "Materi 8"));

            MenuMateriAdapter adapter = new MenuMateriAdapter(list);
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
