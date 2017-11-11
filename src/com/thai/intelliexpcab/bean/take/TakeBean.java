package com.thai.intelliexpcab.bean.take;

public class TakeBean {

    /**
     * code : 200
     * msg : success
     * data : {"deliveryDoorNo":11}
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
         * deliveryDoorNo : 11
         */

        private int deliveryDoorNo;

        public int getDeliveryDoorNo() {
            return deliveryDoorNo;
        }

        public void setDeliveryDoorNo(int deliveryDoorNo) {
            this.deliveryDoorNo = deliveryDoorNo;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "deliveryDoorNo=" + deliveryDoorNo +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TakeBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
