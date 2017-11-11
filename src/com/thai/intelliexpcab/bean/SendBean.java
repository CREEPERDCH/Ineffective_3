package com.thai.intelliexpcab.bean;

public class SendBean {

    /**
     * code : 200
     * msg : success
     * data : {"sendCode":"431936"}
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
         * sendCode : 431936
         */

        private String sendCode;

        public String getSendCode() {
            return sendCode;
        }

        public void setSendCode(String sendCode) {
            this.sendCode = sendCode;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "sendCode='" + sendCode + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SendBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
