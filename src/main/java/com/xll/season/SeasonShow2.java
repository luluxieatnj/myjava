package com.xll.season;

public class SeasonShow2 {

    public static void main(String[] args) {

        show(() -> {
            System.out.println(666);
        });
    }

    public static void show(Weather weather) {
        weather.showWeather();
    }
}
