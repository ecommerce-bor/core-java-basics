package com.product.ObjectClass.test;

import com.product.ObjectClass.User;

public class ObjectMethodsTest {

    public static void main(String[] args) {
        User user =new User(1,"obula");
        User user1 =new User(1,"obula");
//        System.out.println("hashcode for user: "+user.hashCode());
//        System.out.println("hashcode for user1: "+user1.hashCode());

        System.out.println(user.equals(user1));

    }
}
