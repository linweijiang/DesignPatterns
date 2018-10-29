# 设计模式

## 一、单例模式
单例模式个人认为最完美的是内部类生成的单例，借助于类加载是线程安全的，使得单例的生成是线程安全的。[样例代码](https://github.com/linweijiang/DesignPatterns/blob/master/src/main/java/com/lwj/basis/designpatterns/single/SingletonInnerClass.java)

优点：保持类对象唯一性，对于频繁创建和销毁的对象可以提高性能。

缺点：扩展困难，单例的方法无法生成子类对象，要扩展的话基本要重写这个类。

## 二、原型模式
原型模式可以理解为对 对象进行拷贝。[样例代码](https://github.com/linweijiang/DesignPatterns/tree/master/src/main/java/com/lwj/basis/designpatterns/prototype)

分为两种拷贝：

    浅拷贝：只拷贝对象的基本数据类型，引用类型还是和被拷贝者指向通过对象
            通过实现 Cloneable 接口，实现具体的 clone 方法

    深拷贝：被拷贝对象不论是基本类型还是引用类型都拷贝一份
            通过序列化对象来实现深拷贝
            （深拷贝还有一种实现方式，代码中没有书写相关代码，就是在浅拷贝的clone方法中单独对引用了类型进行单独拷贝后设置，不实用）