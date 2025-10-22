package com.product.inter;

public class UserRepositoryImpl implements UserRepository,Category{
    @Override
    public String getUserByName(String userName) {
        return "user";
    }

    @Override
    public Integer getUserId() {
        return 0;
    }

    @Override
    public String getCategoryName() {
        return "";
    }
}
