package com.ting.design.factory.simple;

/**
 * 简单工厂模式-提供食物的厨师
 *
 * @author ting
 * @date 2020/06/16
 */
public class ZhangSanCookImpl implements IRestaurant{
    /**
     * 提供的食物
     */
    @Override
    public void food() {
        System.out.println("------------鱼香肉丝------------");
    }
}
