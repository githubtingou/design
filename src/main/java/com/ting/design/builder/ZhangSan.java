package com.ting.design.builder;

/**
 * 建造者模式-张三
 *
 * @author ting
 * @date 2020/06/16
 */
public class ZhangSan extends AbstractNoodle {
    /**
     * 买
     *
     * @param noodelName 泡面品种
     */
    @Override
    void buy(String noodelName) {
        System.out.println("买" + noodelName + "泡面");
    }

    /**
     * 烧水
     *
     * @param type 水的种类
     */
    @Override
    void water(String type) {
        System.out.println("使用" + type + "烧开水");

    }

    /**
     * 吃
     *
     * @param tool 吃饭工具
     */
    @Override
    void eat(String tool) {
        System.out.println("使用" + tool + "吃泡面");
    }

    /**
     * 处理
     */
    @Override
    void deal() {
        System.out.println("整理桌面");
    }

    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        zhangSan.eat("筷子");
        zhangSan.buy("康师傅");
        zhangSan.deal();

        zhangSan.water("矿泉水");


    }
}
