package com.ting.design.builder;

/**
 * 建造模式-抽象类
 *
 * @author lishuang
 * @date 2020/06/16
 */
public abstract class AbstractNoodle {

    /**
     * 买
     *
     * @param noodelName 泡面品种
     */
    abstract void buy(String noodelName);

    /**
     * 烧水
     *
     * @param type 水的种类
     */
    abstract void water(String type);

    /**
     * 吃
     *
     * @param tool 吃饭工具
     */
    abstract void eat(String tool);

    /**
     * 处理
     */
    abstract void deal();
}
