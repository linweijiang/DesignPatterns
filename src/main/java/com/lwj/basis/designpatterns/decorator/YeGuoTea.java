package com.lwj.basis.designpatterns.decorator;

/**
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class YeGuoTea extends Decoretor{
    private Tea tea;

    public YeGuoTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getName() {
        return "椰果" + tea.getName();
    }
}
