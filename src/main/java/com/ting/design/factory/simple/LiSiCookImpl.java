package com.ting.design.factory.simple;

/**
 * 简单工厂模式-提供食物的厨师：李四
 *
 * @author lishuang
 * @date 2020/06/16
 */
public class LiSiCookImpl implements IRestaurant {
    /**
     * 提供的食物
     */
    @Override
    public void food() {
        System.out.println("------------麻婆豆腐------------");
    }
}
