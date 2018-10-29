package com.lwj.basis.designpatterns.prototype;

import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * 家庭类
 * @author 瓜牛呱呱
 * @date 2018/10/29
 */
public class Family implements Cloneable, Serializable{
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

    /**
     * 通过序列化进行 深拷贝
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Family deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        Family family = (Family)new ObjectInputStream(bais).readObject();
        return family;
    }
}
