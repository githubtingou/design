package com.ting.design.min.里式替换;

import java.util.Collection;
import java.util.HashMap;

/**
 * 子类重载
 *
 * @author ting
 * @version 1.0
 * @date 2020/10/03
 */
public class Son extends Father {
    public Collection doSomeThing(HashMap map) {
        System.out.println("子类执行。。。");
        return map.values();
    }
}
