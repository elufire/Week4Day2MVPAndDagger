package com.example.week4day2mvpanddagger.dagger;


import com.example.week4day2mvpanddagger.homeandoffice.Office;

import dagger.Component;

@Component(modules = OfficeModule.class)
public interface OfficeComponent {

    Office getOffice();
}
