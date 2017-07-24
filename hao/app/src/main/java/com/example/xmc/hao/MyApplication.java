package com.example.xmc.hao;

import android.app.Application;
import android.content.Context;


/**
 * Created by xmc on 2017/7/12.
 */

public class MyApplication extends Application {
    private static Context context;
    public static MyApplication instances;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        instances=this;

    }
    public static MyApplication getInstances(){
        return instances;
    }


    public static Context getContext() {
        return context;
    }

}

