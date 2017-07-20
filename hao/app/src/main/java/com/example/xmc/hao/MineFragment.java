package com.example.xmc.hao;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.example.xmc.hao.Login.LoginActivity;
import com.example.xmc.hao.Login.UserAllPublicInfo;
import com.example.xmc.hao.Util.API;
import com.example.xmc.hao.Util.RetrofitCookie;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by xmc on 2017/7/10.
 */

public class MineFragment extends Fragment {
    private API api;
    private Button logoutButton;
    private SharedPreferences prefs;
    private SharedPreferences.Editor mEditor;
    private CircleImageView mCircleImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mine_fragment,container,false);
        mCircleImageView=(CircleImageView)view.findViewById(R.id.mine_circle_imageView);
        logoutButton=(Button)view.findViewById(R.id.btn_logout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        RetrofitCookie retrofitCookie = new RetrofitCookie();
        api = retrofitCookie.getApi();
        Call<UserAllPublicInfo> call = api.getUserAllPublicInfo();
        call.enqueue(new Callback<UserAllPublicInfo>() {
            @Override
            public void onResponse(Call<UserAllPublicInfo> call, Response<UserAllPublicInfo> response) {
                Glide.with(MineFragment.this).load(response.body().getData().getAvatar()).into(mCircleImageView);
            }

            @Override
            public void onFailure(Call<UserAllPublicInfo> call, Throwable t) {

            }
        });
        return view;
    }


}
