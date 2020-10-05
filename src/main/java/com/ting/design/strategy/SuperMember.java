package com.ting.design.strategy;

/**
 * 超级会员
 *
 * @author ting
 * @date 2020/07/03
 */
public class SuperMember implements Member {
    /**
     * 计算价格
     * 超级会员 7折
     *
     * @param bookPrice
     * @return
     */
    @Override
    public double calPrice(double bookPrice) {
        return bookPrice * 0.7;
    }
}
