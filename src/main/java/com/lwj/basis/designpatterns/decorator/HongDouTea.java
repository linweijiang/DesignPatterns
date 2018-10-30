package com.lwj.basis.designpatterns.decorator;

/**
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class HongDouTea extends Decoretor{
    private Tea tea;

    public HongDouTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getName() {
        return "红豆" + tea.getName();
    }
}
