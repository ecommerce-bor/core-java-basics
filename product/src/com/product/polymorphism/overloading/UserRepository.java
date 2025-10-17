package com.product.polymorphism.overloading;

public final class UserRepository {

    public String findUser(Integer id){
        return "user found with id: "+"id";
    }

    public  String findUser(String name){
        return "user found with name: "+name;
    }

    public String findUser(Integer id,String email){
        return "user found with id: "+id+" with email: "+email;
    }

    public static String findUser(Integer id,Integer age){
        return "user found with id: "+"id";
    }

    private String findUser(Long age){
        return "user found with id: "+"id";
    }

    final String findUser(char gender){
        return "Male";
    }

}
