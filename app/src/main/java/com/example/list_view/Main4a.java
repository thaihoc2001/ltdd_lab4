package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class Main4a extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Good> products;
    private CustomGoodsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listview);

        listView = findViewById(R.id.idListview);

        products = new ArrayList<>();
        products.add(new Good("Ca nấu lẩu","Devang",R.drawable.ca_nau_lau));
        products.add(new Good("1 kg Khô gà, Bơ tỏi","LDT Shop",R.drawable.ga_bo_toi));
        products.add(new Good("Xa cần cẩu đa năng","Thế giới đồ chơi",R.drawable.xa_can_cau));
        products.add(new Good("Đồ chơi dạng mô hình","Thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        products.add(new Good("Lãnh đạo đơn giản","Minh Long book",R.drawable.lanh_dao_gian_don));
        products.add(new Good("Hiểu lòng con trẻ","Minh Long book",R.drawable.hieu_long_con_tre));

        adapter = new CustomGoodsAdapter(this,R.layout.item_listview,products);
        listView.setAdapter(adapter);
    }
}
