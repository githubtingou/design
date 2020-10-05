package com.ting.design.min.里式替换;

/**
 * 狙击手类
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/01
 */
public class Snipper {

    public void killEnemies(AUG aug) {
        aug.zoomOut();
        aug.shoot();
    }
}
