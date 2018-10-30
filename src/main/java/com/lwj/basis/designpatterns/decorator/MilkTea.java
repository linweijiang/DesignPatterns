package com.lwj.basis.designpatterns.decorator;

/**
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class MilkTea extends Decoretor{
    private Tea tea;

    public MilkTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getName() {
        return "奶" + tea.getName();
    }
}
