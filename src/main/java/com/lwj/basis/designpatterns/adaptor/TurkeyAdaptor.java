package com.lwj.basis.designpatterns.adaptor;

/**
 * 如果它飞起来像只鸭子，叫起来像只鸭子，那么它必定（可能）是一只鸭子（包装了鸭子的适配器的火鸡）
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class TurkeyAdaptor implements Duck{

    TurKey turKey;

    public TurkeyAdaptor(TurKey turKey) {
        this.turKey = turKey;
    }

    public void quack() {
        turKey.gobble();
    }

    public void fly() {
        /**
         * 鸭子可以飞得很远，火鸡飞得不远
         * 如果想让火鸡飞起来想只鸭子，可以让火鸡多飞几次，使得它像只鸭子
         */
        for (int i = 0; i < 5; i++) {
            turKey.fly();
        }
    }
}
