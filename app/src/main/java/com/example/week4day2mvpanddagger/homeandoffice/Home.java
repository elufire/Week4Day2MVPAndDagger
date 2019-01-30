package com.example.week4day2mvpanddagger.homeandoffice;

public class Home {
    String rooms;
    String color;
    String address;
    String pool;

    public Home(String rooms, String color, String address, String pool) {
        this.rooms = rooms;
        this.color = color;
        this.address = address;
        this.pool = pool;
    }

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
}
