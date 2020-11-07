package com.ting.design.factory.simple;

/**
 * 工厂模式
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/10
 */
public class HumanFactory extends AbstractHumanFactory {
    /**
     * 创建人种
     *
     * @param tClass
     * @return
     */
    @Override
    public <T extends IHuman> T createHuman(Class<T> tClass) {
        IHuman iHuman = null;
        try {
            iHuman = (IHuman) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成失败");
        }

        return (T) iHuman;
    }
}
