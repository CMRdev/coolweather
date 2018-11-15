package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 建立城市基本信息实体
 * 使用注解方式，让json字段和java字段之间建立映射关系
 * Created by i on 2018/11/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
