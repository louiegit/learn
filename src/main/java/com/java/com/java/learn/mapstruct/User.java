package com.java.com.java.learn.mapstruct;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-26 下午2:32
 */
@Data
public class User {

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    private Integer age;
    private String name;

}
