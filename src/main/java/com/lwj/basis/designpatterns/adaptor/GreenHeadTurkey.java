package com.lwj.basis.designpatterns.adaptor;

/**
 * 绿头火鸡
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class GreenHeadTurkey implements TurKey{
    public void gobble() {
        System.out.println("绿头火鸡 咯咯叫");
    }

    public void fly() {
        System.out.println("绿头火鸡 飞啊飞 很短~");
    }
}
