package com.product.java.eight.functional.Interface;

@FunctionalInterface
public interface Product {

    String getProductName(String name);

    default Integer getProductId(){
        return 1;
    }

    static String getProductDescription(){
        return "product";
    }
}
