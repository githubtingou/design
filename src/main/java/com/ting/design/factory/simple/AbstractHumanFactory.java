package com.ting.design.factory.simple;

/**
 * 抽象工厂模式
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/10
 */
public abstract class AbstractHumanFactory {
    /**
     * 创建人种
     *
     * @param tClass
     * @param <T>
     * @return
     */
    public abstract <T extends IHuman> T createHuman(Class<T> tClass);
}
