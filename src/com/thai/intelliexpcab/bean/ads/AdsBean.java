package com.thai.intelliexpcab.bean.ads;

import java.util.List;

public class AdsBean {

    /**
     * code : 200
     * msg : success
     * data : [{"bid":1,"bannerImg":"xxx","bannerUrl":"xxx","seqNo":1,"title":"xxx","status":1}]
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
         * bid : 1
         * bannerImg : xxx
         * bannerUrl : xxx
         * seqNo : 1
         * title : xxx
         * status : 1
         */

        private int bid;
        private String bannerImg;
        private String bannerUrl;
        private int seqNo;
        private String title;
        private int status;

        public int getBid() {
            return bid;
        }

        public void setBid(int bid) {
            this.bid = bid;
        }

        public String getBannerImg() {
            return bannerImg;
        }

        public void setBannerImg(String bannerImg) {
            this.bannerImg = bannerImg;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public void setBannerUrl(String bannerUrl) {
            this.bannerUrl = bannerUrl;
        }

        public int getSeqNo() {
            return seqNo;
        }

        public void setSeqNo(int seqNo) {
            this.seqNo = seqNo;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "bid=" + bid +
                    ", bannerImg='" + bannerImg + '\'' +
                    ", bannerUrl='" + bannerUrl + '\'' +
                    ", seqNo=" + seqNo +
                    ", title='" + title + '\'' +
                    ", status=" + status +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AdsBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
