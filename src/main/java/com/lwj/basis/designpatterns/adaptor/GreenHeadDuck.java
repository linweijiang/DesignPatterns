package com.lwj.basis.designpatterns.adaptor;

/**
 * 绿头鸭
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class GreenHeadDuck implements Duck{
    public void quack() {
        System.out.println("绿头鸭 嘎嘎叫");
    }

    public void fly() {
        System.out.println("绿头鸭 飞啊飞 很远~");
    }
}
