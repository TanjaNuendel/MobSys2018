package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView; //Handler erstellen -- Klasse???
    private RecyclerView.LayoutManager layoutManager; //Wir brauchen ein LayoutManager für das Layout, in dem Fall damit es aussieht wie eine Liste
    private List<String> list;
    private RecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sucht sich recyclerview aus der R
        recyclerView = findViewById(R.id.recyclerview); // Handler initalisieren????

        // Konstruktor für Layout
        layoutManager = new LinearLayoutManager(this); //für Konstrukter nur ein this als Parameter

        // setzt Layoutmanager an RV an
        recyclerView.setLayoutManager(layoutManager); //set

        // holt sich die list die Daten aus der String-XML - Data Container hier einbinden
        list = Arrays.asList(getResources().getStringArray(R.array.books));

        // erstellt Adapter mit list
        adapter = new RecyclerAdapter(list);

        // setzt den RV auf feste Größe
        recyclerView.setHasFixedSize(true);

        // setzt Adapter an RV an
        recyclerView.setAdapter(adapter);

    }
}
