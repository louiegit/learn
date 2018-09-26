package com.java.com.java.learn.mapstruct;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-26 下午2:31
 */
@Data

public class PeopleEntity {

    public PeopleEntity() {
    }

    public PeopleEntity(Integer age, String name, String callNumber, String address, String emile) {
        this.age = age;
        this.name = name;
        this.callNumber = callNumber;
        this.address = address;
        this.emile = emile;
    }

    private Integer age;
    private String name;
    private String callNumber;
    private String address;
    private String emile;
}
