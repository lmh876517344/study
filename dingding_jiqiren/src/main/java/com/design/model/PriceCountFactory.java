package com.design.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 车辆计费生产工厂
 */
public class PriceCountFactory {

    private List<PriseCount> priseCounts = new ArrayList<>();

    public PriseCount getPriceCount(CountRequest obj){
        for (PriseCount priseCount : priseCounts) {
            if (priseCount.support(obj)){
                return priseCount;
            }
        }
        return null;
    }


    /**
     * 在spring注入list内
     */
    public PriceCountFactory() {
        priseCounts.add(new OneCarPrice());
        priseCounts.add(new EntPrice());
        priseCounts.add(new LadderPrice());
    }
}
