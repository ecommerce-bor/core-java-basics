package com.product.inheritance.test;

import com.product.inheritance.Item;
import com.product.inheritance.SubCategory;

public class ItemTest {

    public static void main(String[] args) {
        Item item=new Item();

        System.out.println(item.subCategoryid);//inheritance
        System.out.println(item.itemId);
        item.printSubCategoryId();
        item.printSubCategoryId();

        SubCategory subCategory=new Item();
        System.out.println(subCategory.subCategoryid);
        subCategory.printSubCategoryId();//if we create object with child class if it is present in child class then it will take from child class only


    }
}
