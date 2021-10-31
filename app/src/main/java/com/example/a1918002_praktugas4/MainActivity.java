package com.example.a1918002_praktugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BolaAdapter adapter;
    private ArrayList<Bola> bolaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new BolaAdapter(bolaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        bolaArrayList = new ArrayList<>();
        bolaArrayList.add(new Bola("Arsenal", "Asal : Bermarkas di Holloway, London, Inggris", "Julukan : The Gunners.",R.drawable.arsenal));
        bolaArrayList.add((new Bola("Chelsea","Asal : Bermarkas di Fulham, London, Inggris", "Julukan : The Blues.",R.drawable.chelsea)));
        bolaArrayList.add((new Bola("Leichester City", "Asal : Bermarkas di Leicester, Inggris", "Julukan : The Foxes.",R.drawable.leicester)));
        bolaArrayList.add((new Bola("Liverpool","Asal : Bermarkas di Anfield Kota Liverpool, Inggris", "Julukan : The Reds",R.drawable.liverpool)));
        bolaArrayList.add((new Bola("Manchester City", "Asal : Bermarkas di Stadion Etihad, Manchester, Inggris.", "Julukan : The Cityzen.", R.drawable.mancity)));
        bolaArrayList.add((new Bola("Manchester United", "Asal : Bermarkas di Old Trafford, Manchester, Inggris.", "Julukan : The Red Devil.", R.drawable.manutd)));
        bolaArrayList.add((new Bola("Tottenham Hotspur", "Asal : Bermarkas di Tottenham, London Utara, Inggris", "Julukan : The Lilywhites", R.drawable.tottenham)));
    }
}

