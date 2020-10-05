package com.ting.design.min.依赖倒置.impl;

import com.ting.design.min.依赖倒置.ICar;
import com.ting.design.min.依赖倒置.IDriver;

/**
 * 驾驶员实现类
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/03
 */
public class DriverImpl implements IDriver {

    /**
     * 驾驶员
     *
     * @param iCar 驾驶工具接口
     */
    @Override
    public void drive(ICar iCar) {
        iCar.run();
    }
}
