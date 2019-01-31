package com.example.week4day2mvpanddagger;


import com.example.week4day2mvpanddagger.homeandoffice.Office;

public class OfficeDisplayPresenter {
    OfficeDisplayContract officeDisplayContract;

    public OfficeDisplayPresenter(OfficeDisplayContract officeDisplayContract){
        this.officeDisplayContract = officeDisplayContract;
    }

    public void getOfficeDisplay(Office office){
        officeDisplayContract.passOfficeDisplay(office);
    }
}
