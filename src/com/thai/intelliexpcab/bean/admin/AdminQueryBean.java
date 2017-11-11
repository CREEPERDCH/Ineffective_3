package com.thai.intelliexpcab.bean.admin;

import java.util.List;

public class AdminQueryBean {

    /**
     * code : 200
     * msg : success
     * data : [{"deliveryNo":1,"deliverySchool":"school","deliveryRegion":"region","deliveryModel":111,"deliveryStatus":2,"createTime":"Nov 7, 2017
     * 3:03:03 PM","updateTime":"Nov 8, 2017 12:18:22 PM","deliveryPassword":"666666","maintainer":"maintainer",
     * "maintainerPhone":"maintainer_phone","doorSum":2,"doorUsingSum":2},{"deliveryNo":2,"deliveryStatus":2,"createTime":"Nov 8, 2017 11:26:22
     * AM","updateTime":"Nov 8, 2017 12:07:31 PM","deliveryPassword":"666666","doorSum":0,"doorUsingSum":0}]
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
         * deliveryNo : 1
         * deliverySchool : school
         * deliveryRegion : region
         * deliveryModel : 111
         * deliveryStatus : 2
         * createTime : Nov 7, 2017 3:03:03 PM
         * updateTime : Nov 8, 2017 12:18:22 PM
         * deliveryPassword : 666666
         * maintainer : maintainer
         * maintainerPhone : maintainer_phone
         * doorSum : 2
         * doorUsingSum : 2
         */

        private int deliveryNo;
        private String deliverySchool;
        private String deliveryRegion;
        private int deliveryModel;
        private int deliveryStatus;
        private String createTime;
        private String updateTime;
        private String deliveryPassword;
        private String maintainer;
        private String maintainerPhone;
        private int doorSum;
        private int doorUsingSum;

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

        public int getDeliveryModel() {
            return deliveryModel;
        }

        public void setDeliveryModel(int deliveryModel) {
            this.deliveryModel = deliveryModel;
        }

        public int getDeliveryStatus() {
            return deliveryStatus;
        }

        public void setDeliveryStatus(int deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
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

        public int getDoorSum() {
            return doorSum;
        }

        public void setDoorSum(int doorSum) {
            this.doorSum = doorSum;
        }

        public int getDoorUsingSum() {
            return doorUsingSum;
        }

        public void setDoorUsingSum(int doorUsingSum) {
            this.doorUsingSum = doorUsingSum;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "deliveryNo=" + deliveryNo +
                    ", deliverySchool='" + deliverySchool + '\'' +
                    ", deliveryRegion='" + deliveryRegion + '\'' +
                    ", deliveryModel=" + deliveryModel +
                    ", deliveryStatus=" + deliveryStatus +
                    ", createTime='" + createTime + '\'' +
                    ", updateTime='" + updateTime + '\'' +
                    ", deliveryPassword='" + deliveryPassword + '\'' +
                    ", maintainer='" + maintainer + '\'' +
                    ", maintainerPhone='" + maintainerPhone + '\'' +
                    ", doorSum=" + doorSum +
                    ", doorUsingSum=" + doorUsingSum +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AdminQueryBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
