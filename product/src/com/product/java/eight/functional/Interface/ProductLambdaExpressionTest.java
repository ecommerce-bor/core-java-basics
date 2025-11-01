package com.product.java.eight.functional.Interface;

public class ProductLambdaExpressionTest {

    public static void main(String[] args) {
        Product product=(p)->{
            String name="print product";
            return name+p;
        };
        System.out.println(product.getProductName("product"));

    }
}
