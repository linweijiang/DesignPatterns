
package com.lwj.basis.designpatterns.adaptor;

/**
 * 测试一下我的火鸡、鸭子、适配出来的鸭子，嘿嘿
 * @author 瓜牛呱呱
 * @date 2018/10/30
 */
public class AdaptorTest {
    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        GreenHeadTurkey greenHeadTurkey = new GreenHeadTurkey();
        TurkeyAdaptor turkeyAdaptor = new TurkeyAdaptor(greenHeadTurkey);

        //测试一下这只火鸡
        System.out.println("测试一下这只火鸡===>");
        greenHeadDuck.quack();
        greenHeadTurkey.fly();

        //测试一下纯正的鸭子
        System.out.println("\n测试一下纯正的鸭子===>");
        testDuck(greenHeadDuck);

        //测试一下通过火鸡适配出来的鸭子
        System.out.println("\n测试一下通过火鸡适配出来的鸭子===>");
        testDuck(turkeyAdaptor);
    }

    /**
     * 测试这只鸭子
     * @param duck
     */
    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
