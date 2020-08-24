package com.tdl.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tdl.myapplication.R;
import com.tdl.myapplication.model.FastFood;

import java.util.ArrayList;

public class FastFoodAdapter extends BaseAdapter {

    Context context;
    ArrayList<FastFood> arrayList;
    LayoutInflater inflater;

    public FastFoodAdapter(Context context, ArrayList<FastFood> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        inflater = (LayoutInflater.from(context));
    }



    @Override
    public int getCount() {
        return arrayList.size();
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
        convertView = inflater.inflate(R.layout.fast_food_cell,null);

        ImageView ivWeatherICon = convertView.findViewById(R.id.ivFoodImage);
        TextView tvCategory = convertView.findViewById(R.id.tvCategory);
        TextView tvType = convertView.findViewById(R.id.tvType);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);

        FastFood fastFood = arrayList.get(position);

        ivWeatherICon.setImageResource(fastFood.getFoodImage());
        tvCategory.setText(fastFood.getCategory());
        tvType.setText(fastFood.getType());
        tvPrice.setText(fastFood.getPrice() + "");




        return convertView;
    }
}
