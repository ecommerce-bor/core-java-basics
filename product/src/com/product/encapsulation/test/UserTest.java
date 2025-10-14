package com.product.encapsulation.test;

import com.product.encapsulation.User;

public class UserTest {

    public static void main(String[] args) {
        User user=new User();
        user.setUserId(1);
        user.setUserName("java");

        System.out.println("getUserId:"+user.getUserId());
        System.out.println("getUserName:"+user.getUserName());
    }
}
