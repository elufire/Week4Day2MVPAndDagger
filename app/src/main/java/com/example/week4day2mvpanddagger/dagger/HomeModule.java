package com.example.week4day2mvpanddagger.dagger;

import com.example.week4day2mvpanddagger.homeandoffice.Home;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {

    @Provides
    Home getHome(){
        return new Home("5", "red", "Montwood", "true");
    }
}
