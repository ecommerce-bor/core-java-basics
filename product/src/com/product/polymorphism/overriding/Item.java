package com.product.polymorphism.overriding;

public  class Item {

    //private,static,final methods we cannot override
    public  void saveItem(){
        System.out.println("saving item");
    }

    public String findItemByName(){
        return "Electronics";
    }


}
