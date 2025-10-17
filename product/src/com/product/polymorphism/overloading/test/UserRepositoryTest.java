package com.product.polymorphism.overloading.test;

import com.product.polymorphism.overloading.UserRepository;

public class UserRepositoryTest {

    public static void main(String[] a) {
        UserRepository userRepository=new UserRepository();
        System.out.println(userRepository.findUser(1));
        System.out.println(userRepository.findUser("user"));
        System.out.println(userRepository.findUser(1,"user"));
    }
    
}
