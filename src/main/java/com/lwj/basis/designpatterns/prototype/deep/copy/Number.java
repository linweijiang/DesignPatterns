package com.lwj.basis.designpatterns.prototype.deep.copy;

import com.alibaba.fastjson.JSONObject;

/**
 * 家庭成员类
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class Number implements Cloneable{
    private String name;
    Number(String name){
        System.out.println("Number构造器运行。。。");
        this.name = name;
    }

    /**
     * 深拷贝——手动赋值的引用类型需要重写clone方法
     * @return
     */
    @Override
    protected Object clone() {
        Number number = null;
        try {
            number = (Number)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
