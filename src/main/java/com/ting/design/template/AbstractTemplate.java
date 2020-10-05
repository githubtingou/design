package com.ting.design.template;

/**
 * 模板类-抽象类
 *
 * @author ting
 * @date 2020/06/16
 */
public abstract class AbstractTemplate {

    public String name = "0";

    /**
     * 执行步骤
     *
     * @param noodelName 泡面品种
     * @param type       水的种类
     * @param tool       吃饭工具
     */
    public void step(String noodelName, String type, String tool) {
        buy(noodelName);
        water(type);
        eat(tool);
        deal();
    }


    /**
     * 买
     *
     * @param noodelName 泡面品种
     */
    abstract void buy(String noodelName);

    /**
     * 烧水
     *
     * @param type 水的种类
     */
    abstract void water(String type);

    /**
     * 吃
     *
     * @param tool 吃饭工具
     */
    abstract void eat(String tool);

    /**
     * 处理
     */
    abstract void deal();
}
