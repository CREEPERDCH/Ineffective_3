package com.thai.intelliexpcab.bean.admin;

import java.util.List;

public class AdminModelBean {

    /**
     * code : 200
     * msg : success
     * data : [{"mid":1,"deliveryLockersModel":"111111","deliveryLockersRow":3,"deliveryLockersColumn":6,"deliveryLockersDoorNumber":18},{"mid":2,
     * "deliveryLockersModel":"222222","deliveryLockersRow":4,"deliveryLockersColumn":8,"deliveryLockersDoorNumber":32},{"mid":3,
     * "deliveryLockersModel":"333333","deliveryLockersRow":5,"deliveryLockersColumn":6,"deliveryLockersDoorNumber":30},{"mid":4,
     * "deliveryLockersModel":"444444","deliveryLockersRow":4,"deliveryLockersColumn":5,"deliveryLockersDoorNumber":20}]
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
         * mid : 1
         * deliveryLockersModel : 111111
         * deliveryLockersRow : 3
         * deliveryLockersColumn : 6
         * deliveryLockersDoorNumber : 18
         */

        private int mid;
        private String deliveryLockersModel;
        private int deliveryLockersRow;
        private int deliveryLockersColumn;
        private int deliveryLockersDoorNumber;

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public String getDeliveryLockersModel() {
            return deliveryLockersModel;
        }

        public void setDeliveryLockersModel(String deliveryLockersModel) {
            this.deliveryLockersModel = deliveryLockersModel;
        }

        public int getDeliveryLockersRow() {
            return deliveryLockersRow;
        }

        public void setDeliveryLockersRow(int deliveryLockersRow) {
            this.deliveryLockersRow = deliveryLockersRow;
        }

        public int getDeliveryLockersColumn() {
            return deliveryLockersColumn;
        }

        public void setDeliveryLockersColumn(int deliveryLockersColumn) {
            this.deliveryLockersColumn = deliveryLockersColumn;
        }

        public int getDeliveryLockersDoorNumber() {
            return deliveryLockersDoorNumber;
        }

        public void setDeliveryLockersDoorNumber(int deliveryLockersDoorNumber) {
            this.deliveryLockersDoorNumber = deliveryLockersDoorNumber;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "mid=" + mid +
                    ", deliveryLockersModel='" + deliveryLockersModel + '\'' +
                    ", deliveryLockersRow=" + deliveryLockersRow +
                    ", deliveryLockersColumn=" + deliveryLockersColumn +
                    ", deliveryLockersDoorNumber=" + deliveryLockersDoorNumber +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AdminModelBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
