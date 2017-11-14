package com.thai.intelliexpcab.bean.admin;

public class AdminQueryBean {


    /**
     * code : 200
     * msg : success
     * data : {"deliveryNo":1,"deliverySchool":"学校","deliveryRegion":"地区","deliveryModel":"11","deliveryStatus":2,"createTime":1510038183000,
     * "updateTime":1510144550000,"deliveryPassword":"111","maintainer":"123","maintainerPhone":"1"}
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
         * deliveryNo : 1
         * deliverySchool : 学校
         * deliveryRegion : 地区
         * deliveryModel : 11
         * deliveryStatus : 2
         * createTime : 1510038183000
         * updateTime : 1510144550000
         * deliveryPassword : 111
         * maintainer : 123
         * maintainerPhone : 1
         */

        private int deliveryNo;
        private String deliverySchool;
        private String deliveryRegion;
        private String deliveryModel;
        private int deliveryStatus;
        private long createTime;
        private long updateTime;
        private String deliveryPassword;
        private String maintainer;
        private String maintainerPhone;

        public int getDeliveryNo() {
            return deliveryNo;
        }

        public void setDeliveryNo(int deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getDeliverySchool() {
            return deliverySchool;
        }

        public void setDeliverySchool(String deliverySchool) {
            this.deliverySchool = deliverySchool;
        }

        public String getDeliveryRegion() {
            return deliveryRegion;
        }

        public void setDeliveryRegion(String deliveryRegion) {
            this.deliveryRegion = deliveryRegion;
        }

        public String getDeliveryModel() {
            return deliveryModel;
        }

        public void setDeliveryModel(String deliveryModel) {
            this.deliveryModel = deliveryModel;
        }

        public int getDeliveryStatus() {
            return deliveryStatus;
        }

        public void setDeliveryStatus(int deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public String getDeliveryPassword() {
            return deliveryPassword;
        }

        public void setDeliveryPassword(String deliveryPassword) {
            this.deliveryPassword = deliveryPassword;
        }

        public String getMaintainer() {
            return maintainer;
        }

        public void setMaintainer(String maintainer) {
            this.maintainer = maintainer;
        }

        public String getMaintainerPhone() {
            return maintainerPhone;
        }

        public void setMaintainerPhone(String maintainerPhone) {
            this.maintainerPhone = maintainerPhone;
        }
    }
}
