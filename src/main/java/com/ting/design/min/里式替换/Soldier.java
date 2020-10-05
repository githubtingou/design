package com.ting.design.min.里式替换;

/**
 * 士兵类
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/01
 */
public class Soldier {
    private AbstractGun abstractGun;

    public Soldier setAbstractGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
        return this;
    }

    public void kill() {
        abstractGun.shoot();
    }

}

