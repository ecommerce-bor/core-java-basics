package com.product.methods.Inheritance;

public class Item extends SubCategory {

    public int itemId=1;


    public int getItemId(){
        return itemId;
    }

    public void printSubCategoryId(){
        System.out.println("item level ");
    }


}
