package com.example.list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class GridviewAdapter extends BaseAdapter{
    private Context context;
    private int idlayout;
    private List<Good> productList;

    public GridviewAdapter(Context context, int idlayout, List<Good> productList) {
        this.context = context;
        this.idlayout = idlayout;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        if (!productList.isEmpty() && productList.size()!=0)
            return productList.size();
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idlayout,parent,false);
        }

        TextView tvGoodName = convertView.findViewById(R.id.textViewProductName4b);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView4b);
        final Good good = productList.get(position);

        if (productList != null && !productList.isEmpty()) {
            imageView.setImageResource(good.getImageGoods());
        }
        return convertView;
    }
}
