package com.thai.intelliexpcab.bean.admin;

import java.io.Serializable;

public class SettingsBean implements Serializable {
    private int status;
    private String deliveryNo;
    private String deliveryRegion;
    private String deliverySchool;
    private String deliveryModel;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public String getDeliveryRegion() {
        return deliveryRegion;
    }

    public void setDeliveryRegion(String deliveryRegion) {
        this.deliveryRegion = deliveryRegion;
    }

    public String getDeliverySchool() {
        return deliverySchool;
    }

    public void setDeliverySchool(String deliverySchool) {
        this.deliverySchool = deliverySchool;
    }

    public String getDeliveryModel() {
        return deliveryModel;
    }

    public void setDeliveryModel(String deliveryModel) {
        this.deliveryModel = deliveryModel;
    }

    @Override
    public String toString() {
        return "SettingsBean{" +
                "status=" + status +
                ", deliveryNo='" + deliveryNo + '\'' +
                ", deliveryRegion='" + deliveryRegion + '\'' +
                ", deliverySchool='" + deliverySchool + '\'' +
                ", deliveryModel='" + deliveryModel + '\'' +
                '}';
    }
}
