package com.lwj.basis.designpatterns.single;

/**
 * 使用内部类的方式实现单例
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class SingletonInnerClass {
    private SingletonInnerClass(){
    }
    private static class SingletonHolder {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
