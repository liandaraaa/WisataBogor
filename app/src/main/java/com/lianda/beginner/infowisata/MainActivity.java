package com.lianda.beginner.infowisata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Waterfall> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Wisata Bogor");

        rvCategory = (RecyclerView) findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(WaterfallData.getListData());

        showRecyclerCardView();

    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewWaterfallAdapter cardViewWaterfallAdapter = new CardViewWaterfallAdapter(this);
        cardViewWaterfallAdapter.setListWaterfall(list);
        rvCategory.setAdapter(cardViewWaterfallAdapter);
    }
}
