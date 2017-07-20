package com.example.xmc.hao.Login;


import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by xmc on 2017/7/7.
 */

public class ClearEditText extends AppCompatEditText implements View.OnTouchListener,View.OnFocusChangeListener,TextWatcher{

    public ClearEditText(Context context) {
        super(context);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }
}

