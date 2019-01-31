package com.example.week4day2mvpanddagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.week4day2mvpanddagger.homeandoffice.Office;

public class Main4Activity extends AppCompatActivity implements OfficeDisplayContract{
    OfficeDisplayPresenter officeDisplayPresenter;
    TextView tvFurniture;
    TextView tvWindows;
    TextView tvBathroom;
    TextView tvColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bindViews();
        officeDisplayPresenter = new OfficeDisplayPresenter(this);
        Intent intent = getIntent();
        Office office = intent.getParcelableExtra("Office_Value");
        officeDisplayPresenter.getOfficeDisplay(office);

    }

    private void bindViews(){
        tvFurniture =findViewById(R.id.tvFurniture);
        tvWindows =findViewById(R.id.tvWindows);
        tvBathroom =findViewById(R.id.tvBathroom);
        tvColor =findViewById(R.id.tvOfficeColor);
    }

    @Override
    public void passOfficeDisplay(Office office) {
        if(office != null){
            tvBathroom.setText(office.getBathroom());
            tvColor.setText(office.getColor());
            tvFurniture.setText(office.getFurniture());
            tvWindows.setText(office.getWindows());
        }
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnMakeHomes:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnMakeOffice:
                intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
