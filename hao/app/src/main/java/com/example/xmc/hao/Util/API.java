package com.example.xmc.hao.Util;

import com.example.xmc.hao.Login.LoginMsg;
import com.example.xmc.hao.Login.User;
import com.example.xmc.hao.Login.UserAllPublicInfo;
import com.example.xmc.hao.Login.UserPublicInfo;
import com.example.xmc.hao.exam.StudentExamTrend;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by xmc on 2017/7/12.
 */

public interface API {
    //用户登录
    @POST("/v2/users/sessions")
    Call<LoginMsg> getLogin(@Body User user);

    //RxJava,demo测试
    @POST("/v2/users/sessions")
    Observable<LoginMsg> login(@Body User user);


    //获取用户公开信息
    @GET("/v2/user-center/public-info")
    Call<UserPublicInfo> getUserPublicInfo();

    //获取一名学生成绩趋势概况并返回最近一次考试摘要信息
    @GET("/v2/exam/trends")
    Call<StudentExamTrend> getStudentExamTrend();

    //获取用户综合信息（用于获取登录后首页显示的综合性内容）
    @GET("/v2/user-center/user-snapshot")
    Call<UserAllPublicInfo> getUserAllPublicInfo();
}
