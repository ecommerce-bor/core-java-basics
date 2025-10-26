package com.product.encapsulation;

import java.util.Objects;

public class User {

   private   Integer userId;
   private   String userName;

   public User(){}

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

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


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName);
    }
}
