package com.example.week4day2mvpanddagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.week4day2mvpanddagger.homeandoffice.Home;

public class MainActivity extends AppCompatActivity implements HomeContract{
    HomePresenter homePresenter;
    EditText etRooms;
    EditText etPool;
    EditText etAddress;
    EditText etColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homePresenter = new HomePresenter(this);
        bindViews();
    }

    private void bindViews(){
        etAddress = findViewById(R.id.etAddress);
        etColor = findViewById(R.id.etColor);
        etPool = findViewById(R.id.etPool);
        etRooms = findViewById(R.id.etRooms);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHome:
                homePresenter.getHome(etRooms.getText().toString(), etColor.getText().toString(), etAddress.getText().toString(), etPool.getText().toString());
                break;
                case R.id.btnActivityTwo:
                    Intent intent = new Intent(this, Main2Activity.class);
                    startActivity(intent);
                    break;

        }
    }

    @Override
    public void passHome(Home home) {
        if(home != null){
            Intent intent = new Intent(this, Main3Activity.class);
            intent.putExtra("Home_Value", home);
            startActivity(intent);
        }
    }
}
