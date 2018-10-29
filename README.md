# 设计模式

## 单例模式
单例模式个人认为最完美的是内部类生成的单例，借助于类加载是线程安全的，使得单例的生成是线程安全的。[样例代码](https://github.com/linweijiang/DesignPatterns/blob/master/src/main/java/com/lwj/basis/designpatterns/single/SingletonInnerClass.java)

优点：保持类对象唯一性，对于频繁创建和销毁的对象可以提高性能。

缺点：扩展困难，单例的方法无法生成子类对象，要扩展的话基本要重写这个类。


