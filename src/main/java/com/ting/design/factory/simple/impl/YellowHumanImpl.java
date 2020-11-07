package com.ting.design.factory.simple.impl;

import com.ting.design.factory.simple.IHuman;

/**
 * 黄种人
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/10
 */
public class YellowHumanImpl implements IHuman {
    /**
     * 肤色
     */
    @Override
    public void getColor() {
        System.out.println("黄色人种的肤色是黄色的");
    }

    /**
     * 讲话
     */
    @Override
    public void talk() {
        System.out.println("黄种人大部分讲汉语");

    }
}
