package com.ting.design.strategy;

/**
 * 中级会员
 *
 * @author lishuang
 * @date 2020/07/03
 */
public class IntermediateMenber implements Member {
    /**
     * 计算价格
     * 中级会员 8折
     *
     * @param bookPrice
     * @return
     */
    @Override
    public double calPrice(double bookPrice) {
        return bookPrice * 0.8;
    }
}
