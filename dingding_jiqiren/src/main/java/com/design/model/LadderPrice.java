package com.design.model;

/**
 * 阶梯计费
 */
public class LadderPrice implements PriseCount {
    @Override
    public boolean support(CountRequest obj) {
        if ("3".equals(obj.getType()))
            return true;
        return false;
    }

    @Override
    public void priceCount(CountRequest obj) {
        System.out.println("这是阶梯计费----------------");
    }
}
