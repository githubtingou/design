package com.ting.design.factory.simple.impl;

import com.ting.design.factory.simple.IHuman;

/**
 * 白人
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/10
 */
public class WhiteHumanImpl implements IHuman {
    /**
     * 肤色
     */
    @Override
    public void getColor() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        System.out.println("白色人种的肤色是白色的");

    }

    /**
     * 讲话
     */
    @Override
    public void talk() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("白人大部分讲英语");

    }
}
