package com.product.encapsulation;

public class User {

   private   Integer userId;
   private   String userName;

   public User(){}

    public void setUserId(Integer userId){
       this.userId=userId;
    }

    public void setUserName(String userName){
    this.userName=userName;
    }

    public Integer getUserId(){
       return userId;
    }

    public String getUserName(){
       return userName;
    }


}
