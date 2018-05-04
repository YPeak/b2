package com.entity;

import org.apache.ibatis.type.Alias;

/**
 * Created by shuwei.yu.
 * on 2018/5/4.
 */
@Alias("address")
public class Address {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    private String age;
    private String mm;

    public Address(String name, String age, String mm) {
        this.name = name;
        this.age = age;
        this.mm = mm;
    }
}
