package com.design.model;


/**
 * 单车计费
 */
public class OneCarPrice implements PriseCount {
    @Override
    public boolean support(CountRequest obj) {
        if ("1".equals(obj.getType()))
            return true;
        return false;
    }

    @Override
    public void priceCount(CountRequest obj) {
        System.out.println("这是单车计费--------------");
    }
}
