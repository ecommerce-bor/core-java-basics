package com.product.methods.test;

import com.product.methods.Categorey;

public class CategoreyTest {


    public static void main(String[] args) {

        //type referenceName=new constructor();
        Categorey categorey=new Categorey(1,"Electronics");
        System.out.println("categoreyId is: "+categorey.getCategoreyId());
        System.out.println("catgeoreyName is: "+categorey.getCategoreyName());



    }
}
