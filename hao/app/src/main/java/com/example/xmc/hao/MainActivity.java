package com.example.xmc.hao;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xmc.hao.Login.LoginActivity;
import com.example.xmc.hao.Util.NoScrollViewPager;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private MainPagerAdapter adapter;
    private NoScrollViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref=PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor =pref.edit();
        editor.putString("keepLogin","true");
        editor.apply();
        init();
        adapter=new MainPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager, true);
        mTabLayout.getTabAt(0).setText("考试").setIcon(R.drawable.home_icon_stjx);
        mTabLayout.getTabAt(1).setText("错题本");
        mTabLayout.getTabAt(2).setText("直播课");
        mTabLayout.getTabAt(3).setText("练习");
        mTabLayout.getTabAt(4).setText("我的");

    }
    public void init(){
          mViewPager=(NoScrollViewPager) findViewById(R.id.view_pager_main);
          mTabLayout=(TabLayout)findViewById(R.id.tabLayout);
    }

}
