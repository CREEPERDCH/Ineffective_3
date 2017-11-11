package com.thai.intelliexpcab.bean.admin;


public class AdminUserBean {


    /**
     * code : 200
     * msg : success
     * data : {"uid":1,"username":"123","email":null,"qq":null,"phone":"","superadmin":1,"status":1,"lastLogin":1510121127000,
     * "createTime":1510108357000}
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
         * uid : 1
         * username : 123
         * email : null
         * qq : null
         * phone :
         * superadmin : 1
         * status : 1
         * lastLogin : 1510121127000
         * createTime : 1510108357000
         */

        private int uid;
        private String username;
        private Object email;
        private Object qq;
        private String phone;
        private int superadmin;
        private int status;
        private long lastLogin;
        private long createTime;

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public Object getQq() {
            return qq;
        }

        public void setQq(Object qq) {
            this.qq = qq;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getSuperadmin() {
            return superadmin;
        }

        public void setSuperadmin(int superadmin) {
            this.superadmin = superadmin;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public long getLastLogin() {
            return lastLogin;
        }

        public void setLastLogin(long lastLogin) {
            this.lastLogin = lastLogin;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "uid=" + uid +
                    ", username='" + username + '\'' +
                    ", email=" + email +
                    ", qq=" + qq +
                    ", phone='" + phone + '\'' +
                    ", superadmin=" + superadmin +
                    ", status=" + status +
                    ", lastLogin=" + lastLogin +
                    ", createTime=" + createTime +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AdminUserBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
