package com.example.baitap.network;

import com.example.baitap.model.Wheather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "https://developer.accuweather.com";

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=fAr0sVK2d9dXtwsygNT3BMEKA4BaljQ5&language=vi-vn&metric=true")
    Call<List<Wheather>> gethour();

    @GET("/forecasts/v1/daily/5day/353412?apikey=i5doO0KFzjMo7e7tsZWcyeHVwhEV9yCE&language=vi-vn&metric=true")
    Call<List<Wheather>> getday();

}
