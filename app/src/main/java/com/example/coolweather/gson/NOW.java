package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建当前天气信息实体
 * Created by i on 2018/11/13.
 */

public class NOW {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
