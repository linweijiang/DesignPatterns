package com.lwj.basis.designpatterns.prototype.shallow;

import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * 家庭类
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class Family implements Cloneable{
    private Integer count;
    private Number number;

    public Family(Integer count, Number number) {
        this.count = count;
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    /**
     * 重写clone方法
     * @return
     */
    @Override
    protected Object clone(){
        Family family = null;
        try {
            family = (Family)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return family;
    }
}
