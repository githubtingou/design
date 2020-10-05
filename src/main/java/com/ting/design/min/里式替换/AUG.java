package com.ting.design.min.里式替换;

/**
 * AUG狙击枪
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/01
 */
public class AUG extends Rifle {

    public void zoomOut() {
        System.out.println("狙击手使用望远镜选择敌人");
    }

    @Override
    public void shoot() {
        System.out.println("使用AUG射击---->");
    }
}
