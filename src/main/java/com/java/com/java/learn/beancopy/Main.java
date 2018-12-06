package com.java.com.java.learn.beancopy;

import com.alibaba.fastjson.JSON;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-11-02 1:50 PM
 */
public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setAge(11);
        user.setName("luo");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            UserMapper.INSTANCE.userToDTO(user);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
