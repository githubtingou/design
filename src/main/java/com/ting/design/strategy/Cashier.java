package com.ting.design.strategy;

/**
 * 书籍价格
 *
 * @author lishuang
 * @date 2020/07/03
 */
public class Cashier {
    /**
     * 会员,策略对象
     */
    private Member member;

    public Cashier(Member member) {
        this.member = member;
    }

    /**
     * 计算应付价格
     *
     * @param bookPrice
     * @return
     */
    public double quote(double bookPrice) {
        return this.member.calPrice(bookPrice);
    }

}
