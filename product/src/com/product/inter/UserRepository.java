package com.product.inter;

public interface UserRepository {

    //public static final
    Integer id = 0;

    //public abstract
   String getUserByName(String userName);

    Integer getUserId();

    String getCategoryName();

    default String getUserNameByEmail(){
        return "userEmail";
    }

   public static String getUserById(){
      return "user";
    }

}
