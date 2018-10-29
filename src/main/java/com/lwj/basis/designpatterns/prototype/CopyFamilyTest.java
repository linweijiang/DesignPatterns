package com.lwj.basis.designpatterns.prototype;

import java.io.IOException;

/**
 * 对家庭类进行拷贝（浅拷贝/深拷贝）
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class CopyFamilyTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 通过上面的测试，发现对于clone的对象
         * 如果是基础数据类型，那么会生成新的一份数据
         * 如果是引用类型，那么拷贝的是对象的引用，拷贝和被拷贝两者指向的是同一个对象
         */
        /**
         * 对于通过深拷贝的对象，不论是引用类型，还是基本数据类型，都是clone出新的一份
         */
        /**
         * 而且对于构造器只运行了一次，说明没有再次初始化
         */
        Family family = new Family(1, new Number("baba"));
        //浅拷贝
        Family clone = (Family)family.clone();
        //深拷贝
        Family deepClone = family.deepClone();

        System.out.println("clone=======>");
        System.out.println("原型==>" + family.toString());
        System.out.println("浅拷贝==>" + clone.toString());
        System.out.println("深拷贝==>" + deepClone.toString());

        System.out.println("\nfamily.setCount(2)======>");
        family.setCount(2);
        System.out.println("原型==>" + family.toString());
        System.out.println("浅拷贝==>" + clone.toString());
        System.out.println("深拷贝==>" + deepClone.toString());

        System.out.println("\nfamily.getNumber().setName(\"mama\")======>");
        family.getNumber().setName("mama");
        System.out.println("原型==>" + family.toString());
        System.out.println("浅拷贝==>" + clone.toString());
        System.out.println("深拷贝==>" + deepClone.toString());
    }
}
