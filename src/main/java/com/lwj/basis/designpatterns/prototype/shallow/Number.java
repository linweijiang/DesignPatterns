package com.lwj.basis.designpatterns.prototype.shallow;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * 家庭成员类
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class Number {
    private String name;
    Number(String name){
        System.out.println("Number构造器运行。。。");
        this.name = name;
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
