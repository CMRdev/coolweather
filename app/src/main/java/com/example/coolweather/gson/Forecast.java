package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建未来天气信息实体，声明时使用集合类型来声明
 * Created by i on 2018/11/13.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
