package com.ting.design.min.开闭原则;

/**
 * 小说打折类
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/05
 */
public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public int getPrice() {
        int oldPrice = super.getPrice();
        if (oldPrice >= 1000) {
            return oldPrice * 90 / 100;
        }
        return super.getPrice();
    }
}
