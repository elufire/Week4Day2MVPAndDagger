package com.example.week4day2mvpanddagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.week4day2mvpanddagger.homeandoffice.Office;

public class Main2Activity extends AppCompatActivity implements OfficeContract{
    OfficePresenter officePresenter;
    TextView tvFurniture;
    TextView tvWindows;
    TextView tvBathroom;
    TextView tvColor;
    EditText etFurniture;
    EditText etWindows;
    EditText etBathroom;
    EditText etColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        officePresenter = new OfficePresenter(this);
        bindViews();
    }

    private void bindViews(){
        tvFurniture =findViewById(R.id.tvFurniture);
        tvWindows =findViewById(R.id.tvWindows);
        tvBathroom =findViewById(R.id.tvBathroom);
        tvColor =findViewById(R.id.tvOfficeColor);
        etBathroom = findViewById(R.id.etBathroom);
        etColor = findViewById(R.id.etOfficeColor);
        etWindows = findViewById(R.id.etWindows);
        etFurniture = findViewById(R.id.etFurniture);

    }

    public void onClickActTwo(View view) {
        switch (view.getId()){
            case R.id.btnGetOffice:
                officePresenter.getOffice( etColor.getText().toString(),etFurniture.getText()
                        .toString(), etWindows.getText().toString(), etBathroom.getText().toString());
                break;
            case R.id.btnGetOfficeDagger:
                officePresenter.getOfficeDagger();
                break;
            case R.id.btnGoToHomes:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
    }


    @Override
    public void passOffice(Office office) {
        if(office != null){
            tvBathroom.setText(office.getBathroom());
            tvColor.setText(office.getColor());
            tvFurniture.setText(office.getFurniture());
            tvWindows.setText(office.getWindows());
        }
    }
}
