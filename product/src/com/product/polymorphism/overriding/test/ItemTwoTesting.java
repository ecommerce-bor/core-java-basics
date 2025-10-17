package com.product.polymorphism.overriding.test;

import com.product.polymorphism.overriding.Item;
import com.product.polymorphism.overriding.ItemTwo;

public class ItemTwoTesting {

    public static void main(String[] args) {
        Item item=new ItemTwo();

        item.saveItem();
        item.findItemByName();

    }
}
