package com.xll.season;

public class SeasonShow {

    public static void main(String[] args) {
        Season[] seasons = Season.values();

        for (Season season : seasons) {
            season.showWeather();
        }
    }
}
