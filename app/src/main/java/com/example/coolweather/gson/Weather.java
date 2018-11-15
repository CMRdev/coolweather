package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 创建总的实例类来引用各个实体类
 * Created by i on 2018/11/13.
 */

public class Weather {
    public String status;
    public Basic basic;
    public NOW now;
    public Suggestion suggestion;
    public AQI aqi;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
