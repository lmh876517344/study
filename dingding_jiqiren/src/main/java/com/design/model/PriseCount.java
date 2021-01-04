package com.design.model;

/**
 * 使用策略设计模式
 * 实现的实例包括 单车计费、企业计费、梯度计费
 */
public interface PriseCount {
    /**
     * 用于判断当前实例是否支持进行车辆计费
     * @param obj
     * @return
     */
    boolean support(CountRequest obj);

    /**
     * 进行车辆计费计算
     */
    void priceCount(CountRequest obj);
}
