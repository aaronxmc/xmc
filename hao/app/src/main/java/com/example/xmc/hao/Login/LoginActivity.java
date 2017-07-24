package com.example.xmc.hao.Login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xmc.hao.Util.API;
import com.example.xmc.hao.MainActivity;
import com.example.xmc.hao.R;
import com.example.xmc.hao.Util.RetrofitCookie;
import com.example.xmc.hao.databinding.ActivityLoginBinding;
import com.xmc.greendao.gen.DaoMaster;

public class LoginActivity extends AppCompatActivity implements MyHandlers{
    private EditText editTextUser,editTextPass;
    private Button loginButton;
    public SharedPreferences pref;
    private API api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        RetrofitCookie retrofitCookie =new RetrofitCookie();
        api=retrofitCookie.getApi();

        ActivityLoginBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_login);
        editTextUser=(EditText)findViewById(R.id.username);
        editTextPass=(EditText)findViewById(R.id.password);
        loginButton=(Button)findViewById(R.id.login);
        pref=PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=pref.edit();
        editor.remove("keepLogin");
        editor.apply();
        editTextUser.setText(pref.getString("username",null));
        editTextPass.setText(pref.getString("password",null));

        DaoMaster.DevOpenHelper devOpenHelper=new DaoMaster.DevOpenHelper(getApplicationContext(),"xxx_db",null);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username=editTextUser.getText().toString();
                final String password=editTextPass.getText().toString();
                retrofit2.Call<LoginMsg> call =api.getLogin(new User(username,password,"1","2","1"));
                call.enqueue(new retrofit2.Callback<LoginMsg>() {
                    @Override
                    public void onResponse(retrofit2.Call<LoginMsg> call, retrofit2.Response<LoginMsg> response) {
                        String msg =response.body().getMsg();
                        if(msg.equals("登录成功")){
                            SharedPreferences.Editor editor=pref.edit();
                            editor.putString("username",username);
                            editor.putString("password",password);
                            editor.apply();
                            Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(LoginActivity.this,"账号或密码错误",Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(retrofit2.Call<LoginMsg> call, Throwable t) {
                        t.printStackTrace();

                    }
                });

                /**
                 * SharedPreferences.Editor editor=pref.edit();
                 editor.putString("username",username);
                 editor.putString("password",password);
                 editor.apply();
                 */


            }
        });
        binding.setRegisterClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(LoginActivity.this,Register.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public void register() {
        Intent intent =new Intent(LoginActivity.this,Register.class);
        startActivity(intent);
    }
}
