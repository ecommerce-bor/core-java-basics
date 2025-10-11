package com.product.methods.test;

import com.product.methods.SubCategory;

public class SubCategoryTest {

    public static void main(String[] args) {
        System.out.println("id"+SubCategory.getId());

        SubCategory subCategory=new SubCategory();
        System.out.println(subCategory.getSubCategoryName("laptop"));

        subCategory.printName();

       System.out.println(1+1+1);
       System.out.println("1"+"1");//11
       System.out.println(1+"1");



    }


}
