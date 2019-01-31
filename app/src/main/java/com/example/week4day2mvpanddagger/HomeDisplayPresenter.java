package com.example.week4day2mvpanddagger;

import com.example.week4day2mvpanddagger.homeandoffice.Home;

public class HomeDisplayPresenter {
    HomeDisplayContract homeDisplayContract;

    public HomeDisplayPresenter(HomeDisplayContract homeDisplayContract){
        this.homeDisplayContract = homeDisplayContract;
    }

    public void getHomeDisplay(Home home){
         homeDisplayContract.passDisplayHome(home);
    }
}
