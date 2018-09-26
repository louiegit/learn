package com.java.com.java.learn.mapstruct;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-26 下午2:31
 */
@Data
public class PeopleDTO {

    public PeopleDTO(String phoneNumber, String address, String emile, User user) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emile = emile;
        this.user = user;
    }

    private String phoneNumber;
    private String address;
    private String emile;
    private User  user;
}
