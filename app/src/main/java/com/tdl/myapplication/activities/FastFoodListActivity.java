package com.tdl.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tdl.myapplication.R;
import com.tdl.myapplication.adapters.FastFoodAdapter;
import com.tdl.myapplication.model.FastFood;

import java.util.ArrayList;

public class FastFoodListActivity extends AppCompatActivity {

    ListView fastFoodListView;
    ArrayList<FastFood> arrayList = new ArrayList<>();
    FastFoodAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food_list);
        getSupportActionBar().hide();


        fastFoodListView = (ListView) findViewById(R.id.fastFoodListView);
        arrayList.add(new FastFood(R.mipmap.pizza, "Pizza", "Spicy Chicken Pizza", 310));
        arrayList.add(new FastFood(R.mipmap.burger, "Burger", "Beef Burger", 350));
        arrayList.add(new FastFood(R.mipmap.pii, "Pizza", "Chicken Pizza", 250));
        arrayList.add(new FastFood(R.mipmap.chicken, "Burger", "Chicken Burger", 350));
        arrayList.add(new FastFood(R.mipmap.burger, "Burger", "Fish Burger", 310));
        arrayList.add(new FastFood(R.mipmap.mango, "Mango", "Mango Juice", 250));


        adapter = new FastFoodAdapter(this, arrayList);
        fastFoodListView.setAdapter(adapter);

        fastFoodListView.setOnHoverListener(new AdapterView.OnHoverListener(){

            @Override
            public boolean onHover(View v, MotionEvent event) {
                return false;
            }
        });



        fastFoodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(FastFoodListActivity.this, "Keni klikuar mbi header", Toast.LENGTH_SHORT).show();
                } else {
                    String cat = arrayList.get(position - 1).getCategory().toString();
                    String ty = arrayList.get(position - 1).getType().toString();
                    double pr = arrayList.get(position - 1).getPrice();
                    int img = arrayList.get(position - 1).getFoodImage();

                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                    intent.putExtra("cat", cat);
                    intent.putExtra("ty", ty);
                    intent.putExtra("pr", pr);
                    intent.putExtra("img", img);

                    startActivity(intent);
                }
            }
        });

        View headerView = ((LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.header, null, false);
        fastFoodListView.addHeaderView(headerView);


    }

    }

