package com.lwj.basis.designpatterns.single;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式 是线程不安全的
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class SingletonManager {
    private static Map<String,String> objMap = new HashMap<String,String>();
    private SingletonManager() { }
    public static void registerService(String key,String instance){
        if(!objMap.containsKey(key)) {
            try {
                Thread.sleep((long) Math.random());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            objMap.put(key,instance);
        }
    }
    public static String getService(String key) {
        return objMap.get(key);
    }
}
