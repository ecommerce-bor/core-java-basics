package com.product.collection;

import com.product.encapsulation.User;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

    public static void main(String[] args) {

//        Set<Double> linkedHashSet=new LinkedHashSet<>();
//
//        linkedHashSet.add(1.1);
//        linkedHashSet.add(1.2);
//        linkedHashSet.add(1.3);
//        linkedHashSet.add(1.4);
//        linkedHashSet.add(1.5);
//
//        for (Double linkedHashSetElements:linkedHashSet){
//            System.out.println(linkedHashSetElements);
//        }

        Set<User> users=new LinkedHashSet<>();



        users.add(new User(1,"one"));
        users.add(new User(2,"one"));
        users.add(new User(3,"two"));

        for (User user:users){
            System.out.println(user);
        }
    }
}
