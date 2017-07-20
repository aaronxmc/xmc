package com.example.xmc.hao.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xmc.hao.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Register extends AppCompatActivity {
    Button registerCode,registerStuId;
    EditText phone,password,code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registerCode=(Button)findViewById(R.id.register_for_code_btn);
        registerStuId=(Button)findViewById(R.id.register_studentId_btn);
        phone=(EditText)findViewById(R.id.telephone_edit_text);
        password=(EditText)findViewById(R.id.register_password_edit_text);
        code=(EditText)findViewById(R.id.register_code_edit_text);
        registerCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(phone.getText())){
                    Toast.makeText(Register.this,"请输入11位手机号码",Toast.LENGTH_SHORT).show();
                }
                else {
                    String phoneNumber=phone.getText().toString();
                    OkHttpClient okHttpClient =new OkHttpClient();
                    RequestBody requestBody=new FormBody.Builder().add("phoneNumber",phoneNumber)
                            .add("roleType","1").build();
                    Request request=new Request.Builder().url("http://testhfs-be.yunxiao.com/v2/native-users/verification-msg")
                            .post(requestBody).build();
                    okHttpClient.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            e.printStackTrace();
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            String responseText=response.body().string();
                            try {
                                JSONObject jsonObject=new JSONObject(responseText);
                                final String msg =jsonObject.getString("msg");
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(Register.this,msg,Toast.LENGTH_SHORT).show();
                                    }
                                });
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    });


                }
            }
        });


    }
}
