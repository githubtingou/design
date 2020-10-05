package com.ting.design.single;

/**
 * 懒汉模式-线程安全
 * <p>
 * 优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
 * <p>
 * 缺点：synchronized 为独占排他锁，并发性能差。即使在创建成功以后，获取实例仍然是串行化操作。
 *
 * @author ting
 * @date 2020/06/15
 */
public class SlovenlySynchronized {
    private static SlovenlySynchronized slovenlySynchronized;

    private SlovenlySynchronized() {

    }

    public static synchronized SlovenlySynchronized getInstance() {
        if (slovenlySynchronized == null) {
            slovenlySynchronized = new SlovenlySynchronized();
        }
        return slovenlySynchronized;

    }
}
