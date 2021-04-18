package com.example.a1labjurele;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void onBtnBegin(View view) {
        this.tvMain.setText(R.string.txt_show);
        tvMain.setTextColor(getResources().getColor(R.color.black));
    }


    public void onBtnClick(View view) {
        this.tvMain.setText(R.string.txt_changed);
        tvMain.setTextColor(getResources().getColor(R.color.teal_200));
    }

    public void onBtnPaint(View view) {
        tvMain.setTextColor(getResources().getColor(R.color.purple_200));
    }
}