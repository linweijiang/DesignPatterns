package com.lwj.basis.designpatterns.prototype.deep.serializable;

import java.io.IOException;
import java.lang.*;

/**
 * 对家庭类进行拷贝——深拷贝
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class CopyFamilyTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 对于通过深拷贝的对象，不论是引用类型，还是基本数据类型，都是clone出新的一份
         */
        /**
         * 而且对于构造器只运行了一次，说明没有再次初始化
         */
        Family family = new Family(1, new Number("baba"));
        //深拷贝
        Family deepClone = family.deepClone();

        System.out.println("clone=======>");
        System.out.println("原型==>" + family.toString());
        System.out.println("深拷贝==>" + deepClone.toString());

        System.out.println("\nfamily.setCount(2)======>");
        family.setCount(2);
        System.out.println("原型==>" + family.toString());
        System.out.println("深拷贝==>" + deepClone.toString());

        System.out.println("\nfamily.getNumber().setName(\"mama\")======>");
        family.getNumber().setName("mama");
        System.out.println("原型==>" + family.toString());
        System.out.println("深拷贝==>" + deepClone.toString());
    }
}
