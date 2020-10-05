package com.ting.design.min.依赖倒置.impl;

import com.ting.design.min.依赖倒置.ICar;

/**
 * 奔驰
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/03
 */
public class BenzImpl implements ICar {
    /**
     * 驾驶工具执行方法
     */
    @Override
    public void run() {
        System.out.println("奔驰车行驶------");
    }
}
