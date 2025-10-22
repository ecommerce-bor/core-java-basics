package com.product.inter.test;

import com.product.inter.UserRepository;
import com.product.inter.UserRepositoryImpl;

public class UserRepositroyImplTest {
    public static void main(String[] args) {
        UserRepository userRepository=new UserRepositoryImpl();
        System.out.println(userRepository.getUserByName("user"));
        System.out.println(userRepository.getUserNameByEmail());
    }
}
