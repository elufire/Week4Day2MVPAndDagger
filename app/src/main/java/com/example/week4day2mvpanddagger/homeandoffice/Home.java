package com.example.week4day2mvpanddagger.homeandoffice;

import android.os.Parcel;
import android.os.Parcelable;

public class Home implements Parcelable {
    String rooms;
    String color;
    String address;
    String pool;

    public Home(){

    }

    public Home(String rooms, String color, String address, String pool) {
        this.rooms = rooms;
        this.color = color;
        this.address = address;
        this.pool = pool;
    }

    protected Home(Parcel in) {
        rooms = in.readString();
        color = in.readString();
        address = in.readString();
        pool = in.readString();
    }

    public static final Creator<Home> CREATOR = new Creator<Home>() {
        @Override
        public Home createFromParcel(Parcel in) {
            return new Home(in);
        }

        @Override
        public Home[] newArray(int size) {
            return new Home[size];
        }
    };

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(rooms);
        dest.writeString(color);
        dest.writeString(address);
        dest.writeString(pool);
    }
}
