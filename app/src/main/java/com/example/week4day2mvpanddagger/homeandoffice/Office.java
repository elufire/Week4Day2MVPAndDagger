package com.example.week4day2mvpanddagger.homeandoffice;

import android.os.Parcel;
import android.os.Parcelable;

public class Office implements Parcelable {
    String color;
    String furniture;
    String windows;
    String bathroom;

    public Office(){

    }
    public Office(String color, String furniture, String windows, String bathroom) {
        this.color = color;
        this.furniture = furniture;
        this.windows = windows;
        this.bathroom = bathroom;
    }

    protected Office(Parcel in) {
        color = in.readString();
        furniture = in.readString();
        windows = in.readString();
        bathroom = in.readString();
    }

    public static final Creator<Office> CREATOR = new Creator<Office>() {
        @Override
        public Office createFromParcel(Parcel in) {
            return new Office(in);
        }

        @Override
        public Office[] newArray(int size) {
            return new Office[size];
        }
    };

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(color);
        dest.writeString(furniture);
        dest.writeString(windows);
        dest.writeString(bathroom);
    }
}
