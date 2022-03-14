package com.example.list_view;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main4b extends AppCompatActivity {
    private GridView gridView;
    private List<Good> goods;
    private GridviewAdapter gridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gridview);

        gridView = findViewById(R.id.idGridview);

        goods = new ArrayList<>();
        goods.add(new Good("","",R.drawable.dauchuyendoi_1));
        goods.add(new Good("","",R.drawable.dauchuyendoipsps2_1));
        goods.add(new Good("","",R.drawable.daucam_1));
        goods.add(new Good("","",R.drawable.carbusbtops2_1));
        goods.add(new Good("","",R.drawable.giacchuyen_1));
        goods.add(new Good("","",R.drawable.daynguon_1));

        gridViewAdapter = new GridviewAdapter(this,R.layout.item_girdview,goods);
        gridView.setAdapter(gridViewAdapter);
    }
}
