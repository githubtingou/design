package com.ting.design.min.里式替换;

/**
 * 手枪
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/01
 */
public class HandGun extends AbstractGun {
    /**
     * 射击
     */
    @Override
    protected void shoot() {
        System.out.println("使用手枪射击----->");
    }
}
