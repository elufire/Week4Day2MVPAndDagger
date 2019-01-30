package com.example.week4day2mvpanddagger;

import com.example.week4day2mvpanddagger.dagger.DaggerOfficeComponent;
import com.example.week4day2mvpanddagger.dagger.OfficeComponent;
import com.example.week4day2mvpanddagger.homeandoffice.Office;

public class OfficePresenter {
    OfficeContract officeContract;
    OfficeComponent officeComponent;

    public OfficePresenter(OfficeContract officeContract) {
        this.officeContract = officeContract;
        officeComponent = DaggerOfficeComponent.builder().build();
    }

    public  void getOffice(String rooms, String color, String address, String pool){
        officeContract.passOffice(new Office(rooms, color, address, pool));
    }

    public void getOfficeDagger(){
        officeContract.passOffice(officeComponent.getOffice());
    }

}
