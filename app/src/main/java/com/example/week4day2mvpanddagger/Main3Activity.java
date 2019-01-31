package com.example.week4day2mvpanddagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.week4day2mvpanddagger.homeandoffice.Home;

public class Main3Activity extends AppCompatActivity implements HomeDisplayContract {
    HomeDisplayPresenter homeDisplayPresenter;
    TextView tvRooms;
    TextView tvPool;
    TextView tvAddress;
    TextView tvColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        homeDisplayPresenter = new HomeDisplayPresenter(this);
        bindViews();
        Intent intent = getIntent();
        Home home = intent.getParcelableExtra("Home_Value");
        homeDisplayPresenter.getHomeDisplay(home);
    }

    private void bindViews() {
        tvRooms = findViewById(R.id.tvRooms);
        tvPool = findViewById(R.id.tvPool);
        tvAddress = findViewById(R.id.tvAddress);
        tvColor = findViewById(R.id.tvColor);

    }

    @Override
    public void passDisplayHome(Home home) {
        if (home != null) {
            tvAddress.setText(home.getAddress());
            tvColor.setText(home.getColor());
            tvRooms.setText(home.getRooms());
            tvPool.setText(home.getPool());
        }
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnMakeNewHomes:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnMakeNewOffice:
                intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
