package com.example.pdm_labo2_00159817_ej2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Integer> list = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(R.drawable.i1);
        list.add(R.drawable.i2);
        list.add(R.drawable.i3);

        ImageView v1 = findViewById(R.id.i1);
        ImageView v2 = findViewById(R.id.i2);
        ImageView v3 = findViewById(R.id.i3);
        ImageView v4 = findViewById(R.id.i4);
        ImageView v5 = findViewById(R.id.i5);
        ImageView v6 = findViewById(R.id.i6);
        ImageView v7 = findViewById(R.id.i7);
        ImageView v8 = findViewById(R.id.i8);
        ImageView v9 = findViewById(R.id.i9);

        v1.setOnClickListener(this);
        v2.setOnClickListener(this);
        v3.setOnClickListener(this);
        v4.setOnClickListener(this);
        v5.setOnClickListener(this);
        v6.setOnClickListener(this);
        v7.setOnClickListener(this);
        v8.setOnClickListener(this);
        v9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageView imagen = findViewById(v.getId());
        int n = (int) (Math.random() *3);
        imagen.setImageResource(list.get(n));
    }
}
