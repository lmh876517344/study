package com.design.model;

/**
 * 构建者模式
 */
public class CountRequest {
    private final String vid;
    private final String entId;
    private final String type;
    private final String entPriceInfo;

    public CountRequest(String vid, String entId, String type, String entPriceInfo) {
        this.vid = vid;
        this.entId = entId;
        this.type = type;
        this.entPriceInfo = entPriceInfo;
    }

    public static class Builder{
        /**
         * 依赖注入service
         * @Autowired
         * public PriceService service;
         */

        private String vid;
        private String entId;

        public Builder vid(String vid){
            this.vid = vid;
            return this;
        }
        public Builder entId(String entId){
            this.entId = entId;
            return this;
        }

        public CountRequest build(){
            /**
             * 调用service查询组织价格表，然后输出价格表对应的信息 和组织设置的价格类型
             */
            String type = "";
            switch (vid){
                case "1": type = "1";break;
                case "2": type = "2";break;
                case "3": type = "3";break;
            }

            return new CountRequest(vid,entId,type,"这是价格表的详细信息");
        }

    }

    public String getVid() {
        return vid;
    }

    public String getEntId() {
        return entId;
    }

    public String getType() {
        return type;
    }

    public String getEntPriceInfo() {
        return entPriceInfo;
    }
}
