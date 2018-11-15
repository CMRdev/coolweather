package com.example.coolweather.gson;

/**
 * 建立空气质量实体
 * Created by i on 2018/11/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
