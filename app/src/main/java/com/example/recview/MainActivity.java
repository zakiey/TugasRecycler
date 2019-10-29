package com.example.recview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter keluargaAdapter;
    private ArrayList<keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recycleView);
        keluargaAdapter = new keluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Tulus Sasongko", "Bapak",  getDrawable(R.drawable.bapak)));
        keluargaArrayList.add(new keluarga("Suratmi", "Ibu",  getDrawable(R.drawable.emak)));
        keluargaArrayList.add(new keluarga("Zakiey Cahya Ardi Wahana", "Aku",  getDrawable(R.drawable.aku)));
        keluargaArrayList.add(new keluarga("Wana Aji Wicaksono", "Sodara",  getDrawable(R.drawable.aji)));
    }
}
