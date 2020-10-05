package com.ting.design.min.依赖倒置;

/**
 * 驾驶员接口
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/03
 */
public interface IDriver {
    /**
     * 驾驶员
     *
     * @param iCar 驾驶工具接口
     */
    void drive(ICar iCar);
}
