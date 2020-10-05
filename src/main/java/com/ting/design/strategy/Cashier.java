package com.ting.design.strategy;

import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * 书籍价格
 *
 * @author ting
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


    public static void main(String[] args) {
        String str = new String("yVvdcU4sgWK0LtF2Ee7kSvjaVU/aSkkhfwU59A".getBytes(StandardCharsets.UTF_8));
        for (int i = 0; i < 100000000; i++) {
            str = DigestUtils.md2Hex(str);
            if (i == 100000000 - 1 || i == 100000000 - 2) {
                System.out.println(str);
            }
        }
    }


}
