package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 和服务器交互的网络请求类
 * Created by i on 2018/11/11.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();//建立网络请求客户端实例,用来处理服务器响应
        Request request=new Request.Builder().url(address).build();//发送请求
        client.newCall(request).enqueue(callback);
    }
}
