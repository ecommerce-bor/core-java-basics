package com.product.ObjectClass;

import java.util.Objects;

public class User {

    private int userId;
    private String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public int hashCode() {
        return userId;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        } else if (obj==null) {
            return false;
        }
        User other= (User) obj;
        return userId== other.getUserId() && userName.equals(other.getUserName());
    }
}
