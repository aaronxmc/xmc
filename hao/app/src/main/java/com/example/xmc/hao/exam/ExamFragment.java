package com.example.xmc.hao.exam;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xmc.hao.Login.UserAllPublicInfo;
import com.example.xmc.hao.MyApplication;
import com.example.xmc.hao.Util.API;
import com.example.xmc.hao.Login.UserPublicInfo;
import com.example.xmc.hao.R;
import com.example.xmc.hao.Util.RetrofitCookie;
import com.example.xmc.hao.db.ExamOverviewBean;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.xmc.greendao.gen.ExamOverviewBeanDao;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by xmc on 2017/7/10.
 */

public class ExamFragment extends Fragment {
    private API api;
    private TextView scoreTextView,examNameTextView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final com.example.xmc.hao.databinding.ExamFragmentBinding mBinding=DataBindingUtil.inflate(inflater,R.layout.exam_fragment,container,false);
        RetrofitCookie retrofitCookie =new RetrofitCookie();
        api =retrofitCookie.getApi();
        Call<StudentExamTrend> call=api.getStudentExamTrend();
        call.enqueue(new Callback<StudentExamTrend>() {
            @Override
            public void onResponse(Call<StudentExamTrend> call, Response<StudentExamTrend> response) {
                mBinding.setStudentExamTrend(response.body());

                }

            @Override
            public void onFailure(Call<StudentExamTrend> call, Throwable t) {
                t.printStackTrace();

            }
        });
        return mBinding.getRoot();
    }


}
