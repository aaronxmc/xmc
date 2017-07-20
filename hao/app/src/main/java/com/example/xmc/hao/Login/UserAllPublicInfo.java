package com.example.xmc.hao.Login;

/**
 * Created by xmc on 2017/7/13.
 */

public class UserAllPublicInfo {


    /**
     * code : 0
     * msg : 信息获取成功
     * data : {"nickName":"Haofenshu0","gender":1,"birthday":0,"avatar":"http://ct.yunxiao.com:8087/nameservice/downloadImage?attachmentId=39fc15bd-5996-4e8e-955d-eda994d8efb6","location":"001021","phoneNumber":"15641338333","username":"demo001","emailAddress":"","allowToChangeUserName":false,"isMember":true,"isLiveCourseMember":true,"hasAvailableStudyPackage":true,"linkedStudent":{"studentName":"贺筱璐","grade":"初二","schoolName":"成章实验中学"}}
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
         * nickName : Haofenshu0
         * gender : 1
         * birthday : 0
         *
         * avatar : http://ct.yunxiao.com:8087/nameservice/downloadImage?attachmentId=39fc15bd-5996-4e8e-955d-eda994d8efb6
         * location : 001021
         * phoneNumber : 15641338333
         * username : demo001
         * emailAddress :
         * allowToChangeUserName : false
         * isMember : true
         * isLiveCourseMember : true
         * hasAvailableStudyPackage : true
         * linkedStudent : {"studentName":"贺筱璐","grade":"初二","schoolName":"成章实验中学"}
         */

        private String nickName;
        private int gender;
        private int birthday;
        private String avatar;
        private String location;
        private String phoneNumber;
        private String username;
        private String emailAddress;
        private boolean allowToChangeUserName;
        private boolean isMember;
        private boolean isLiveCourseMember;
        private boolean hasAvailableStudyPackage;
        private LinkedStudentBean linkedStudent;

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getBirthday() {
            return birthday;
        }

        public void setBirthday(int birthday) {
            this.birthday = birthday;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public boolean isAllowToChangeUserName() {
            return allowToChangeUserName;
        }

        public void setAllowToChangeUserName(boolean allowToChangeUserName) {
            this.allowToChangeUserName = allowToChangeUserName;
        }

        public boolean isIsMember() {
            return isMember;
        }

        public void setIsMember(boolean isMember) {
            this.isMember = isMember;
        }

        public boolean isIsLiveCourseMember() {
            return isLiveCourseMember;
        }

        public void setIsLiveCourseMember(boolean isLiveCourseMember) {
            this.isLiveCourseMember = isLiveCourseMember;
        }

        public boolean isHasAvailableStudyPackage() {
            return hasAvailableStudyPackage;
        }

        public void setHasAvailableStudyPackage(boolean hasAvailableStudyPackage) {
            this.hasAvailableStudyPackage = hasAvailableStudyPackage;
        }

        public LinkedStudentBean getLinkedStudent() {
            return linkedStudent;
        }

        public void setLinkedStudent(LinkedStudentBean linkedStudent) {
            this.linkedStudent = linkedStudent;
        }

        public static class LinkedStudentBean {
            /**
             * studentName : 贺筱璐
             * grade : 初二
             * schoolName : 成章实验中学
             */

            private String studentName;
            private String grade;
            private String schoolName;

            public String getStudentName() {
                return studentName;
            }

            public void setStudentName(String studentName) {
                this.studentName = studentName;
            }

            public String getGrade() {
                return grade;
            }

            public void setGrade(String grade) {
                this.grade = grade;
            }

            public String getSchoolName() {
                return schoolName;
            }

            public void setSchoolName(String schoolName) {
                this.schoolName = schoolName;
            }
        }
    }
}
