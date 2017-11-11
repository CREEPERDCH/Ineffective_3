package com.thai.intelliexpcab.bean;

import java.util.List;

public class UpdateBean {

    /**
     * code : 200
     * msg : success
     * data : [{"vid":1,"deliveryNo":123123,"version":"1.1.2","finishTime":1510312973000},{"vid":2,"deliveryNo":123,"version":"1.1.2",
     * "finishTime":1510313062000},{"vid":3,"deliveryNo":123,"version":"sd","finishTime":1510312979000},{"vid":4,"deliveryNo":3242,"version":"sd",
     * "finishTime":1510313056000},{"vid":5,"deliveryNo":234,"version":"3","finishTime":1510313067000}]
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
         * vid : 1
         * deliveryNo : 123123
         * version : 1.1.2
         * finishTime : 1510312973000
         */

        private int vid;
        private int deliveryNo;
        private String version;
        private long finishTime;

        public int getVid() {
            return vid;
        }

        public void setVid(int vid) {
            this.vid = vid;
        }

        public int getDeliveryNo() {
            return deliveryNo;
        }

        public void setDeliveryNo(int deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public long getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(long finishTime) {
            this.finishTime = finishTime;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "vid=" + vid +
                    ", deliveryNo=" + deliveryNo +
                    ", version='" + version + '\'' +
                    ", finishTime=" + finishTime +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "UpdateBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
