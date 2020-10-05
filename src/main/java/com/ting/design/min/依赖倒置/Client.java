package com.ting.design.min.依赖倒置;

import com.ting.design.min.依赖倒置.impl.BMWImpl;
import com.ting.design.min.依赖倒置.impl.BenzImpl;
import com.ting.design.min.依赖倒置.impl.DriverImpl;

/**
 * @author ting
 * @version 1.0
 * @date 2020/10/03
 */
public class Client {
    public static void main(String[] args) {
        IDriver lisi = new DriverImpl();
        ICar bmw = new BMWImpl();
        lisi.drive(bmw);
        ICar benz = new BenzImpl();
        lisi.drive(benz);


    }
}
