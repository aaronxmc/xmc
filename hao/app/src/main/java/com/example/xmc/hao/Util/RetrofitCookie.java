package com.example.xmc.hao.Util;

import com.example.xmc.hao.MyApplication;
import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xmc on 2017/7/12.
 */

public class RetrofitCookie {
    public API getApi() {
        ClearableCookieJar cookieJar =
                new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(MyApplication.getContext()));
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cookieJar(cookieJar)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://testhfs-be.yunxiao.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())//配置器
                .build();
        API api = retrofit.create(API.class);
        return api;
    }


}
