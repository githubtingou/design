package com.ting.design.min.里式替换;

/**
 * 步枪
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/01
 */
public class Rifle extends AbstractGun {
    /**
     * 射击
     */
    @Override
    protected void shoot() {
        System.out.println("使用步枪射击-------->");
    }
}
