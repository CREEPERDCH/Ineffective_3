package com.thai.intelliexpcab.bean.take;

import java.util.List;

public class TakeCheckBean {

    /**
     * code : 200
     * msg : success
     * data : [{"orderNumber":"1","username":"xx","phone":"17520099877","takeNumber":"840133","createTime":"Nov 7, 2017 3:00:57 PM"}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * orderNumber : 1
         * username : xx
         * phone : 17520099877
         * takeNumber : 840133
         * createTime : Nov 7, 2017 3:00:57 PM
         */

        private String orderNumber;
        private String username;
        private String phone;
        private String takeNumber;
        private String createTime;

        public String getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getTakeNumber() {
            return takeNumber;
        }

        public void setTakeNumber(String takeNumber) {
            this.takeNumber = takeNumber;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "orderNumber='" + orderNumber + '\'' +
                    ", username='" + username + '\'' +
                    ", phone='" + phone + '\'' +
                    ", takeNumber='" + takeNumber + '\'' +
                    ", createTime='" + createTime + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TakeCheckBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
