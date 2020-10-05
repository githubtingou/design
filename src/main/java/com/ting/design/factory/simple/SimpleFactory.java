package com.ting.design.factory.simple;

/**
 * 简单工厂模式
 * <p>
 * 特点
 * <p>
 * 1 它是一个具体的类，非接口 抽象类。有一个重要的实现方法方法，利用if或者 switch创建实体类并返回。
 * <p>
 * 2 实现方法通常是静态的，所以也称之为静态工厂。
 * <p>
 * 缺点
 * 1 扩展性差（需要重新加一个实现类，并修改工厂类方法）
 * <p>
 * 2 不同的产品需要不同额外参数的时候 不支持。
 *
 * @author ting
 * @date 2020/06/16
 */
public class SimpleFactory {

    public static final String ZHANG_SAN = "张三";
    public static final String LI_SI = "李四";

    public static IRestaurant food(String cookName) {
        switch (cookName) {
            case ZHANG_SAN:
                return new ZhangSanCookImpl();
            case LI_SI:
                return new LiSiCookImpl();
            default:
                return () -> System.out.println("没有该厨师，无法提供食物");

        }

    }

    public static void main(String[] args) {
        IRestaurant restaurant = food("王五");
        restaurant.food();
    }
}
