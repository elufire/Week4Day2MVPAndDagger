package com.example.week4day2mvpanddagger.homeandoffice;

public class Office {
    String color;
    String furniture;
    String windows;
    String bathroom;

    public Office(String color, String furniture, String windows, String bathroom) {
        this.color = color;
        this.furniture = furniture;
        this.windows = windows;
        this.bathroom = bathroom;
    }

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
}
