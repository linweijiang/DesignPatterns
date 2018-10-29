package com.lwj.basis.designpatterns.single;

/**
 * 多运行几次，发现输出结果不是一致的
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class SingletonManagerTest {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                SingletonManager.registerService("aa","nihao-aa");
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                SingletonManager.registerService("aa","nihao-bb");
            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(SingletonManager.getService("aa"));
    }
}
