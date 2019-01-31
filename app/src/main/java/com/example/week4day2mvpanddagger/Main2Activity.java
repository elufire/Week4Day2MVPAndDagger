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
            case R.id.btnGoToHomes:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
    }


    @Override
    public void passOffice(Office office) {
        if(office != null){
            Intent intent = new Intent(this, Main4Activity.class);
            intent.putExtra("Office_Value", office);
            startActivity(intent);
        }
    }
}
