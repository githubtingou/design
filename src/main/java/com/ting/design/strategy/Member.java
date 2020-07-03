package com.ting.design.strategy;

/**
 * 会员
 *
 * @author lishuang
 * @date 2020/07/03
 */
public interface Member {

    /**
     * 计算价格
     *
     * @param bookPrice
     * @return
     */
    abstract double calPrice(double bookPrice);
}
