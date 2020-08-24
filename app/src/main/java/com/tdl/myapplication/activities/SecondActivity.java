package com.tdl.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tdl.myapplication.R;

import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {


    ImageView img1;
    TextView ty,cat,pr;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn=(Button) findViewById(R.id.generate);
        img1 = (ImageView) findViewById(R.id.ivFoodImage);
        ty = (TextView) findViewById(R.id.tvType);
        cat = (TextView) findViewById(R.id.tvCategory);
        pr = (TextView) findViewById(R.id.tvPrice);



        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int x =(int)(Math.random()*100);
                String x2 = new Integer(x).toString();




                Toast.makeText(SecondActivity.this, x2, Toast.LENGTH_SHORT).show();

            }
        });
            int imgHolder = getIntent().getIntExtra("img",0);
            String typeHolder=getIntent().getStringExtra("ty");
            String catHolder=getIntent().getStringExtra("cat");
            double prHolder=getIntent().getDoubleExtra("pr",0);
            String finalresult = new Double(prHolder).toString();



            img1.setImageResource(imgHolder);
            ty.setText(typeHolder);
            cat.setText(catHolder);
            pr.setText(finalresult);

    }
}
