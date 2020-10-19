package com.example.myapplication.myapplication11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.myapplication11.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        RecyclerView rv = findViewById(R.id.my_recycler);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager rlm = new LinearLayoutManager(this);
        rv.setLayoutManager(rlm);
        String[] couleurs = {"Bleu", "Blanc", "Rouge"};
        MyAdapter adapter = new MyAdapter(couleurs);
        rv.setAdapter(adapter);
    }
}