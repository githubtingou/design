package com.ting.design.factory.simple;

import com.ting.design.factory.simple.impl.BlackHumanImpl;
import com.ting.design.factory.simple.impl.WhiteHumanImpl;
import com.ting.design.factory.simple.impl.YellowHumanImpl;

/**
 * 女娲造人
 *
 * @author lishuang
 * @version 1.0
 * @date 2020/10/10
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();

        // 白色人种
        WhiteHumanImpl whiteHuman = abstractHumanFactory.createHuman(WhiteHumanImpl.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        // 黄色人种
        BlackHumanImpl blackHuman = abstractHumanFactory.createHuman(BlackHumanImpl.class);
        blackHuman.getColor();
        blackHuman.talk();

        //黄色人种
        YellowHumanImpl yellowHuman = abstractHumanFactory.createHuman(YellowHumanImpl.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
