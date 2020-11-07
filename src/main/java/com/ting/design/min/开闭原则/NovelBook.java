package com.ting.design.min.开闭原则;

/**
 * 小说
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/05
 */
public class NovelBook implements IBook {
    private String name;
    private int price;
    private String author;

    public NovelBook() {
    }

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    /**
     * 书名
     *
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public int getPrice() {
        return this.price;
    }

    /**
     * 作者
     *
     * @return
     */
    @Override
    public String getAuthor() {
        return this.author;
    }

}
