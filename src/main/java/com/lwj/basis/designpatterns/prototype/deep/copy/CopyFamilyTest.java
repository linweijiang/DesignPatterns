package com.lwj.basis.designpatterns.prototype.deep.copy;

import java.io.IOException;

/**
 * 对家庭类进行拷贝——深拷贝（手动赋值引用类型）
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class CopyFamilyTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 该拷贝方式 需要对每个被拷贝的类的每个引用类型全部手动赋值一次
         * 如果有引用多个类，那么手动赋值就很麻烦
         */
        Family family = new Family(1, new Number("baba"));
        //深拷贝
        Family clone = (Family)family.clone();

        System.out.println("clone=======>");
        System.out.println("原型==>" + family.toString());
        System.out.println("深拷贝==>" + clone.toString());

        System.out.println("\nfamily.setCount(2)======>");
        family.setCount(2);
        System.out.println("原型==>" + family.toString());
        System.out.println("深拷贝==>" + clone.toString());

        System.out.println("\nfamily.getNumber().setName(\"mama\")======>");
        family.getNumber().setName("mama");
        System.out.println("原型==>" + family.toString());
        System.out.println("深拷贝==>" + clone.toString());
    }
}
