package com.ting.design.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 书店
 * <p>
 * 策略模式仅仅封装算法，提供新的算法插入到已有系统中，策略模式并不决定在何时使用何种算法。在什么情况下使用什么算法是由客户端决定的。
 * <p>
 * <ul>
 * <li>
 * 策略模式的重心
 * <p>
 * 策略模式的重心不是如何实现算法，而是如何组织、调用这些算法，从而让程序结构更灵活，具有更好的维护性和扩展性。
 * </li>
 * <li>
 * 算法的平等性
 * <p>
 * 策略模式一个很大的特点就是各个策略算法的平等性。对于一系列具体的策略算法，大家的地位是完全一样的，正因为这个平等性，才能实现算法之间可以相互替换。所有的策略算法在实现上也是相互独立的，相互之间是没有依赖的。
 * 所以可以这样描述这一系列策略算法：策略算法是相同行为的不同实现。
 * </li>
 * <li>
 * 运行时策略的唯一性
 * <p>
 * 运行期间，策略模式在每一个时刻只能使用一个具体的策略实现对象，虽然可以动态地在不同的策略实现中切换，但是同时只能使用一个。
 * </li>
 * <li>
 * 公有的行为
 * <p>
 * 经常见到的是，所有的具体策略类都有一些公有的行为。这时候，就应当把这些公有的行为放到共同的抽象策略角色Strategy类里面。当然这时候抽象策略角色必须要用Java抽象类实现，而不能使用接口
 * </li>
 * </ul>
 *
 * @author ting
 * @date 2020/07/03
 */
@Slf4j
public class BookStore {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        Member superMenber = new SuperMember();
        //创建环境
        Cashier cashier = new Cashier(superMenber);
        // 计算价格
        double quote = cashier.quote(100);
        log.info("超级会员购书价格{}", quote);

        //选择并创建需要使用的策略对象
        Member primaryMember = new PrimaryMember();
        //创建环境
        Cashier cashier1 = new Cashier(primaryMember);
        // 计算价格
        double quote1 = cashier1.quote(100);
        log.info("初级会员购书价格{}", quote1);

    }
}
