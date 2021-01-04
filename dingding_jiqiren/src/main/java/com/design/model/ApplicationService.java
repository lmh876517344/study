package com.design.model;

/**
 * 测试车辆计费
 */
public class ApplicationService {
    private PriceCountFactory priceCountFactory = new PriceCountFactory();

    public void priceCount(CountRequest obj){
        PriseCount priceCount = priceCountFactory.getPriceCount(obj);
        priceCount.priceCount(obj);
    }

    public static void main(String[] args) {
        ApplicationService service = new ApplicationService();

        CountRequest builder = new CountRequest.Builder().vid("3").entId("1").build();
        service.priceCount(builder);
    }

}
