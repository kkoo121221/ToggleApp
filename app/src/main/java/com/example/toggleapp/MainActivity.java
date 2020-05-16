package com.example.toggleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ToggleButton tog_btn;
    ImageView img1, img2;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);

        tog_btn = (ToggleButton) findViewById(R.id.tog_btn);

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        constraintLayout.setBackgroundColor(Color.parseColor("FFD1BA75"));

        tog_btn.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            constraintLayout.setBackgroundColor(Color.parseColor("FF0E0E0E"));
            img1.setVisibility(View.VISIBLE);
            img2.setVisibility(View.INVISIBLE);
        } else {
            constraintLayout.setBackgroundColor(Color.parseColor("FFD1BA75"));
            img1.setVisibility(View.INVISIBLE);
            img2.setVisibility(View.VISIBLE);
        }
    }
}
