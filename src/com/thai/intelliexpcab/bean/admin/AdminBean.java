package com.thai.intelliexpcab.bean.admin;


public class AdminBean {

    /**
     * code : 200
     * msg : success
     * data : null
     */

    private int code;
    private String msg;
    private AdminBean.DataBean data;

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

    public AdminBean.DataBean getData() {
        return data;
    }

    public void setData(AdminBean.DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * sendCode : 431936
         */

        private String deliveryNo;

        public String getDeliveryNo() {
            return deliveryNo;
        }

        public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "sendCode='" + deliveryNo + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AdminBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
