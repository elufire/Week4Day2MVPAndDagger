package com.example.week4day2mvpanddagger.dagger;

import com.example.week4day2mvpanddagger.homeandoffice.Office;

import dagger.Module;
import dagger.Provides;

@Module
public class OfficeModule {

    @Provides
    Office getOffice(){
        return new Office();
    }
}
