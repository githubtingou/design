package com.ting.design.single;

/**
 * 饱汉模式(懒汉模式)--双重加锁检查DCL
 * <p>
 * 优点：懒加载，线程安全。
 * <p>
 * 注：实例必须有 volatile 关键字修饰，其保证初始化完全。
 *
 * @author lishuang
 * @date 2020/06/15
 */
public class SlovenlySynchronized01 {
    private static SlovenlySynchronized01 slovenlySynchronized01;

    private SlovenlySynchronized01() {
    }

    public static SlovenlySynchronized01 getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (slovenlySynchronized01 == null) {
            //同步块，线程安全的创建实例
            synchronized (SlovenlySynchronized01.class) {
                //再次检查实例是否存在，如果不存在才真的创建实例
                if (slovenlySynchronized01 == null) {
                    slovenlySynchronized01 = new SlovenlySynchronized01();
                    return slovenlySynchronized01;
                }
            }
        }
        return slovenlySynchronized01;
    }
}
