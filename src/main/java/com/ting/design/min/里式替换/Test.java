package com.ting.design.min.里式替换;

import java.util.HashMap;

/**
 * 测试main
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/01
 */
public class Test {
    public static void main(String[] args) {
//        Soldier soldier = new Soldier().setAbstractGun(new Rifle());
//        soldier.kill();
//
//
//        Snipper snipper = new Snipper();
//        snipper.killEnemies(new AUG());

        invoker();

    }

    public static void  invoker(){
        Father father = new Father();
        HashMap hashMap = new HashMap();
        father.doSomeThing(hashMap);

    }
}
