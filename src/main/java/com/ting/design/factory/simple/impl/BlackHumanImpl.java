package com.ting.design.factory.simple.impl;

import com.ting.design.factory.simple.IHuman;

/**
 * 黑人
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/10
 */
public class BlackHumanImpl implements IHuman {
    /**
     * 肤色
     */
    @Override
    public void getColor() {
        System.out.println("黑色人种的肤色是黑色的");
    }

    /**
     * 讲话
     */
    @Override
    public void talk() {
        System.out.println("黑人讲自身部落的语言");

    }
}
