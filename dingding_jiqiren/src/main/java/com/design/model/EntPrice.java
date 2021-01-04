package com.design.model;

/**
 * 企业计费
 */
public class EntPrice implements PriseCount {
    @Override
    public boolean support(CountRequest obj) {
        if ("2".equals(obj.getType()))
            return true;
        return false;
    }

    @Override
    public void priceCount(CountRequest obj) {
        System.out.println("这是企业计费---------------");
        System.out.println("计费价格为：");
    }
}
