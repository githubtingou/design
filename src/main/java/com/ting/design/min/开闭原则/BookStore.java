package com.ting.design.min.开闭原则;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * 书店
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/05
 */
public class BookStore {
    private static final ArrayList<IBook> bookList = new ArrayList<>();

    static {
        bookList.add(new OffNovelBook("天龙八部", 1234, "金庸"));
        bookList.add(new OffNovelBook("巴陵圣母院", 1000, "雨果"));
        bookList.add(new OffNovelBook("倚天屠龙记", 1111, "金庸"));
    }

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println("书店卖出的书籍如下。。。");
        bookList.forEach(var -> {
            System.out.println("书籍名称：" + var.getName()
                    + "\t书籍作者：" + var.getAuthor()
                    + "\t价格￥：" + numberFormat.format(var.getPrice() / 100));
        });
    }
}
