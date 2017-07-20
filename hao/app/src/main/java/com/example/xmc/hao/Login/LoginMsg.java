package com.example.xmc.hao.Login;

/**
 * Created by xmc on 2017/7/12.
 * Gson解析
 */

public class LoginMsg {


    /**
     * code : 0
     * msg : 登录成功
     * data : {"roleType":1,"loginName":"demo001","rememberMe":2,"deviceType":1,"userId":"56850d5d00000ac75857b77a","test":{"cookie":"hfs-test-session-id=66nAaRSWTHduL52hkCQyz2A0TswveCPFBu8NsnN8GTJ2W2aobi%2BcW0SyAcQBh%2Bu%2BDBvegu%2FDf4%2Fv7YUWIVNJPTs%2BHD%2BZ3HOwy5oQV2C6qoeK1%2Bxet7rEvxkQxj3gVs7DEo1dhHFW%2B2%2Bm3N3JH%2FeD%2BA%3D%3D; Max-Age=31536000; Domain=.yunxiao.com; Path=/"}}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * roleType : 1
         * loginName : demo001
         * rememberMe : 2
         * deviceType : 1
         * userId : 56850d5d00000ac75857b77a
         * test : {"cookie":"hfs-test-session-id=66nAaRSWTHduL52hkCQyz2A0TswveCPFBu8NsnN8GTJ2W2aobi%2BcW0SyAcQBh%2Bu%2BDBvegu%2FDf4%2Fv7YUWIVNJPTs%2BHD%2BZ3HOwy5oQV2C6qoeK1%2Bxet7rEvxkQxj3gVs7DEo1dhHFW%2B2%2Bm3N3JH%2FeD%2BA%3D%3D; Max-Age=31536000; Domain=.yunxiao.com; Path=/"}
         */

        private int roleType;
        private String loginName;
        private int rememberMe;
        private int deviceType;
        private String userId;
        private TestBean test;

        public int getRoleType() {
            return roleType;
        }

        public void setRoleType(int roleType) {
            this.roleType = roleType;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public int getRememberMe() {
            return rememberMe;
        }

        public void setRememberMe(int rememberMe) {
            this.rememberMe = rememberMe;
        }

        public int getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(int deviceType) {
            this.deviceType = deviceType;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public TestBean getTest() {
            return test;
        }

        public void setTest(TestBean test) {
            this.test = test;
        }

        public static class TestBean {
            /**
             * cookie : hfs-test-session-id=66nAaRSWTHduL52hkCQyz2A0TswveCPFBu8NsnN8GTJ2W2aobi%2BcW0SyAcQBh%2Bu%2BDBvegu%2FDf4%2Fv7YUWIVNJPTs%2BHD%2BZ3HOwy5oQV2C6qoeK1%2Bxet7rEvxkQxj3gVs7DEo1dhHFW%2B2%2Bm3N3JH%2FeD%2BA%3D%3D; Max-Age=31536000; Domain=.yunxiao.com; Path=/
             */

            private String cookie;

            public String getCookie() {
                return cookie;
            }

            public void setCookie(String cookie) {
                this.cookie = cookie;
            }
        }
    }
}
