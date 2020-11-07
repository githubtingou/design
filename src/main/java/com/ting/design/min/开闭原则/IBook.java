package com.ting.design.min.开闭原则;

/**
 * 书籍接口
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/05
 */
public interface IBook {
    /**
     * 书名
     *
     * @return
     */
    String getName();

    /**
     * 价格
     *
     * @return
     */
     int getPrice();

    /**
     * 作者
     *
     * @return
     */
    String getAuthor();

}
