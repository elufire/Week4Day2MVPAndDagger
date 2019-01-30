package com.example.week4day2mvpanddagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.week4day2mvpanddagger.homeandoffice.Home;

public class Main3Activity extends AppCompatActivity implements HomeContract{
    HomePresenter homePresenter;
    TextView tvRooms;
    TextView tvPool;
    TextView tvAddress;
    TextView tvColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bindViews();
    }

    private void bindViews(){
        tvRooms =findViewById(R.id.tvRooms);
        tvPool =findViewById(R.id.tvPool);
        tvAddress =findViewById(R.id.tvAddress);
        tvColor =findViewById(R.id.tvColor);

    }

    @Override
    public void passHome(Home home) {
        if(home != null){
            tvAddress.setText(home.getAddress());
            tvColor.setText(home.getColor());
            tvRooms.setText(home.getRooms());
            tvPool.setText(home.getPool());
        }
    }
}
