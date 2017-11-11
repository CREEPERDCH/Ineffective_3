package com.thai.intelliexpcab.bean;

public class StatBean {

    /**
     * code : 200
     * msg : success
     * data : {"sumDeliveryLockers":5,"averageUsingTime":405855,"averageUsage":0.41665,"averageSendTime":2738592.5,"averageTakeTime":277.5}
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
         * sumDeliveryLockers : 5
         * averageUsingTime : 405855
         * averageUsage : 0.41665
         * averageSendTime : 2738592.5
         * averageTakeTime : 277.5
         */

        private int sumDeliveryLockers;
        private int averageUsingTime;
        private double averageUsage;
        private double averageSendTime;
        private double averageTakeTime;

        public int getSumDeliveryLockers() {
            return sumDeliveryLockers;
        }

        public void setSumDeliveryLockers(int sumDeliveryLockers) {
            this.sumDeliveryLockers = sumDeliveryLockers;
        }

        public int getAverageUsingTime() {
            return averageUsingTime;
        }

        public void setAverageUsingTime(int averageUsingTime) {
            this.averageUsingTime = averageUsingTime;
        }

        public double getAverageUsage() {
            return averageUsage;
        }

        public void setAverageUsage(double averageUsage) {
            this.averageUsage = averageUsage;
        }

        public double getAverageSendTime() {
            return averageSendTime;
        }

        public void setAverageSendTime(double averageSendTime) {
            this.averageSendTime = averageSendTime;
        }

        public double getAverageTakeTime() {
            return averageTakeTime;
        }

        public void setAverageTakeTime(double averageTakeTime) {
            this.averageTakeTime = averageTakeTime;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "sumDeliveryLockers=" + sumDeliveryLockers +
                    ", averageUsingTime=" + averageUsingTime +
                    ", averageUsage=" + averageUsage +
                    ", averageSendTime=" + averageSendTime +
                    ", averageTakeTime=" + averageTakeTime +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "StatBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
