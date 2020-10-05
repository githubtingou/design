package com.ting.design.single;

/**
 * 懒汉式
 * <p>
 * 优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
 * <p>
 * 缺点：非线程安全。
 *
 * @author ting
 * @date 2020/06/15
 */
public class Slovenly {
    private static Slovenly slovenly = null;

    private Slovenly() {
    }

    public static Slovenly getInstance() {
        if (slovenly == null) {
            slovenly = new Slovenly();
        }
        return slovenly;
    }

}
