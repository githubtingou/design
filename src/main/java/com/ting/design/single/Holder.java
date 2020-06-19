package com.ting.design.single;

/**
 * Holder模式
 * <p>
 * 优点：将懒加载和线程安全完美结合的一种方式（无锁）。
 *
 * @author lishuang
 * @date 2020/06/15
 */
public class Holder {
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    public static class SingleHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Holder holder = new Holder();
    }

    private Holder() {

    }

    public static Holder getInstance() {
        return SingleHolder.holder;
    }
}
