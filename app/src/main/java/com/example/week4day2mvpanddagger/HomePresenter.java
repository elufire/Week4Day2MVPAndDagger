package com.example.week4day2mvpanddagger;

import com.example.week4day2mvpanddagger.dagger.DaggerHomeComponent;
import com.example.week4day2mvpanddagger.dagger.HomeComponent;
import com.example.week4day2mvpanddagger.homeandoffice.Home;

import javax.inject.Inject;

import dagger.Component;

public class HomePresenter {
    HomeContract homeContract;
    HomeComponent homeComponent;


    public HomePresenter(HomeContract homeContract) {
        this.homeContract = homeContract;
        homeComponent = DaggerHomeComponent.builder().build();
    }

    public  void getHome(String rooms, String color, String address, String pool){
        Home home = homeComponent.getHome();
        home.setRooms(rooms);
        home.setColor(color);
        home.setAddress(address);
        home.setPool(pool);
        homeContract.passHome(home);
    }

//    public  void getHomeDagger(){
//        Home home = homeComponent.getHome();
//        home.
//        homeContract.passHome();
//    }


}


