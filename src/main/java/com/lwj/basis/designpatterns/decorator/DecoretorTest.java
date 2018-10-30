package com.lwj.basis.designpatterns.decorator;

/**
 * 装饰者模式
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class DecoretorTest {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea(new Tea());
        System.out.println(milkTea.getName());

        YeGuoTea yeGuoTea = new YeGuoTea(milkTea);
        System.out.println(yeGuoTea.getName());

        HongDouTea hongDouTea = new HongDouTea(yeGuoTea);
        System.out.println(hongDouTea.getName());

        /**
         * 输出：
         * 奶茶
         * 椰果奶茶
         * 红豆椰果奶茶
         */
    }
}
