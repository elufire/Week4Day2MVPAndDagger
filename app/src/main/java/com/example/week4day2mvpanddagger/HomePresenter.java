package com.example.week4day2mvpanddagger;

import com.example.week4day2mvpanddagger.dagger.DaggerHomeComponent;
import com.example.week4day2mvpanddagger.dagger.HomeComponent;
import com.example.week4day2mvpanddagger.homeandoffice.Home;

import dagger.Component;

public class HomePresenter {
    HomeContract homeContract;
    HomeComponent homeComponent;


    public HomePresenter(HomeContract homeContract) {
        this.homeContract = homeContract;
        homeComponent = DaggerHomeComponent.builder().build();
    }

    public  void getHome(String rooms, String color, String address, String pool){
        homeContract.passHome(new Home(rooms, color, address, pool));
    }

    public  void getHomeDagger(){
        homeContract.passHome(homeComponent.getHome());
    }


}


