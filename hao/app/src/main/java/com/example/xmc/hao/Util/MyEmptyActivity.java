package com.example.xmc.hao.Util;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xmc.hao.Login.LoginActivity;
import com.example.xmc.hao.MainActivity;
import com.example.xmc.hao.R;

public class MyEmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_empty);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(preferences.getString("keepLogin",null)==null){
            Intent intent =new Intent(MyEmptyActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Intent intent=new Intent(MyEmptyActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
