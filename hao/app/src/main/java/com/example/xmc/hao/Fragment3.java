package com.example.xmc.hao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.xmc.hao.Login.LoginMsg;
import com.example.xmc.hao.Login.User;
import com.example.xmc.hao.Util.API;
import com.example.xmc.hao.Util.RetrofitCookie;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by xmc on 2017/7/10.
 */

public class Fragment3 extends Fragment {
    private TextView mTextView;
    private Button mButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment3,container,false);
       // mTextView=(TextView)view.findViewById(R.id.retrofit_test_text_view);
       // mButton=(Button)view.findViewById(R.id.retrofit_test_btn);

        /**
         *
         *   mButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        API api=new RetrofitCookie().getApi();
        Observable<LoginMsg> observable =api.login(new User("demo001","123456","1","2","1"));
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<LoginMsg>() {
        @Override
        public void onSubscribe(Disposable d) {

        }

        @Override
        public void onNext(LoginMsg value) {
        mTextView.setText(value.getMsg());
        }

        @Override
        public void onError(Throwable e) {
        Log.d("Test", "onError: "+e);

        }

        @Override
        public void onComplete() {

        }
        });
        }
        });
         */



        return view;
    }



}
