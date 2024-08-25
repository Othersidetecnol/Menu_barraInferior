package com.example.menu_barrainferior.ui.home.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_barrainferior.R;
import com.example.menu_barrainferior.ui.home.Adapter.TrendsAdapter;
import com.example.menu_barrainferior.ui.home.Domain.TrendsDomain;

import java.util.ArrayList;

public class HomeMainClass extends AppCompatActivity {
    private RecyclerView.Adapter adapterTrendList;
    private RecyclerView recyclerViewTrends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> items = new ArrayList<>();
        items.add(new TrendsDomain("TITULO 1", "Subtitulo 1", "Pic1"));
        items.add(new TrendsDomain("TITULO 2", "Subtitulo 2", "Pic2"));
        items.add(new TrendsDomain("TITULO 3", "Subtitulo 3", "Pic3"));


        recyclerViewTrends = findViewById(R.id.recyclerViewTrends);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterTrendList = new TrendsAdapter(items);
        recyclerViewTrends.setAdapter(adapterTrendList);
    }
}
