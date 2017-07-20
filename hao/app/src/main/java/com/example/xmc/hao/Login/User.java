package com.example.xmc.hao.Login;

/**
 * Created by xmc on 2017/7/12.
 */

public class User {
    private String loginName;
    private String password;
    private String roleType;//1
    private String rememberMe;//2
    private  String deviceType;//1

    public User(String loginName,String password,String roleType,String rememberMe,String deviceType) {
        this.loginName =loginName;
        this.password=password;
        this.roleType =roleType;
        this.rememberMe=rememberMe;
        this.deviceType=deviceType;

    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(String rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
