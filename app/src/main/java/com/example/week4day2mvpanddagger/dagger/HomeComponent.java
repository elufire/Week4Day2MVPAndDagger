package com.example.week4day2mvpanddagger.dagger;

import com.example.week4day2mvpanddagger.homeandoffice.Home;

import dagger.Component;

@Component(modules = HomeModule.class)
public interface HomeComponent {

    Home getHome();
}
