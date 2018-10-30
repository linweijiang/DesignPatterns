# 设计模式

## 一、单例模式
单例模式个人认为最完美的是内部类生成的单例，借助于类加载是线程安全的，使得单例的生成是线程安全的。[样例代码](https://github.com/linweijiang/DesignPatterns/blob/master/src/main/java/com/lwj/basis/designpatterns/single/SingletonInnerClass.java)

优点：保持类对象唯一性，对于频繁创建和销毁的对象可以提高性能。

缺点：扩展困难，单例的方法无法生成子类对象，要扩展的话基本要重写这个类。

## 二、原型模式
原型模式可以理解为对 对象进行拷贝。

分为两种拷贝：

### 浅拷贝

  只拷贝对象的基本数据类型，引用类型还是和被拷贝者指向通过对象。通过实现 Cloneable 接口，实现具体的 clone 方法 [样例代码](https://github.com/linweijiang/DesignPatterns/tree/master/src/main/java/com/lwj/basis/designpatterns/prototype/shallow/)

### 深拷贝

  被拷贝对象不论是基本类型还是引用类型都拷贝一份,也是有两种方式来实现深拷贝

（1）通过对引用类型手动赋值的方式来实现深拷贝，当然，该方式需要引用类型也实现Cloneable接口并重写clone方法。[样例代码](https://github.com/linweijiang/DesignPatterns/tree/master/src/main/java/com/lwj/basis/designpatterns/prototype/deep/copy/)

（2）通过序列化对象来实现深拷贝，将对象当做一个对象流来复制。[样例代码](https://github.com/linweijiang/DesignPatterns/tree/master/src/main/java/com/lwj/basis/designpatterns/prototype/deep/serializable/)

## 三、工厂方法模式

在说工厂方法模式之前，先来说说简单工厂模式

### 简单工厂模式

有一个统一的工厂来对所有的产品进行实现，产品有通用的接口，每个产品都需实现产品接口。
使用过程中，用户不需要知道具体的实现细节，只需传入具体的参数，从而获得具体的产品。

### 工厂方法模式

相比于简单工厂模式，更加分工明细，每一个产品都有对应的一个工厂来实现。
在使用的过程中，用户需要传入具体的实现工厂来获得产品。

这里有一篇[文章](https://blog.csdn.net/coder_pig/article/details/54601954)写得非常好，例子也很给力，所以就没有具体书写代码测试

## 四、抽象工厂模式

抽象工厂模式对工厂方法模式的进一步抽象，实现了多产品的切换

也就是之前工厂方法模式的工厂只能生产一个产品，现在的抽象工厂的 一个工厂可以做出不同 产品族 的产品

但是对应的缺点也很明显，就是越来越重。

简单工厂 ~ 工厂方法 ~ 抽象工厂对比如下：

#### 进化：

            优化满足OCP                                   优化满足产品切换

简单工厂 --------------------------->  工厂方法  --------------------------------> 抽象工厂



#### 退化：

    增加了和客户端之间的耦合度（客户端需要知道各种工厂）；变得太重了                                    

简单工厂 --------------------------->  工厂方法  --------------------------------> 抽象工厂

上面的关系图来自：https://blog.csdn.net/u013761036/article/details/51746382

## 五、适配器模式

#### 通俗的定义：

两个彼此间没有太大关联的类，想进行交互完成某些事情，如果直接去修改各自的接口，就显得有些繁琐了。
可以加个中间类， 用它来协调两类之间的关系，完成相关业务。这种玩法就叫适配器模式！

（来自：https://blog.csdn.net/coder_pig/article/details/54633682）

#### 分类：

适配器模式分为 对象适配器 和 类适配器。其中对象适配器是用的引用的关系，而类适配器是继承的关系。

我们通过一个例子来感受一下适配器模式，比如：

如果它飞起来像只鸭子，叫起来像只鸭子，那么它必定（可能）是一只鸭子（包装了鸭子的适配器的火鸡）吗？

[火鸡适配器代码](https://github.com/linweijiang/DesignPatterns/tree/master/src/main/java/com/lwj/basis/designpatterns/adaptor/AdaptorTest.java)