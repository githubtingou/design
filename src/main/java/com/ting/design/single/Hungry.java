package com.ting.design.single;

/**
 * 饿汉式
 * <p>
 * 优点：饿汉模式天生是线程安全的，使用时没有延迟。
 * <p>
 * 缺点：启动时即创建实例，启动慢，有可能造成资源浪费。
 *
 * @author lishuang
 * @date 2020/06/15
 */
public class Hungry {
    private static Hungry hungry = new Hungry();

    private Hungry() {

    }

    public static Hungry getInstance() {
        return hungry;
    }
}
