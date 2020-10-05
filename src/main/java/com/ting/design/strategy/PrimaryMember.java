package com.ting.design.strategy;

/**
 * 初级会员
 *
 * @author ting
 * @date 2020/07/03
 */
public class PrimaryMember implements Member {
    /**
     * 计算价格
     *
     * @param bookPrice
     * @return
     */
    @Override
    public double calPrice(double bookPrice) {
        return bookPrice * 0.9;
    }
}
