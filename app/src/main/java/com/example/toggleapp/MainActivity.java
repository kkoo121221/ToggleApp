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
        tog_btn.setOnCheckedChangeListener(this);

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        constraintLayout.setBackgroundColor(Color.parseColor("#000000"));
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            //ParseColor 只能使用RGB色碼，不可用HEX
            constraintLayout.setBackgroundColor(Color.parseColor("#FFFF99"));
            img1.setVisibility(View.INVISIBLE);
            img2.setVisibility(View.VISIBLE);
        } else {
            constraintLayout.setBackgroundColor(Color.parseColor("#000000"));
            img1.setVisibility(View.VISIBLE);
            img2.setVisibility(View.INVISIBLE);
        }
    }
}
