package com.ting.design.min.里式替换;

import java.util.Collection;
import java.util.Map;

/**
 * 父类重载
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/03
 */
public class Father {

    public Collection doSomeThing(Map map) {
        System.out.println("父类执行。。。。");
        return map.values();
    }
}
