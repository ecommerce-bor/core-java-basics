package com.product.methods;

public class SubCategory {

    //A.M keyword return type methodName
    public static int getId(){
        return 1;
    }


    public void printName(){
        System.out.println("print  NoThing ");
    }

   public  String getSubCategoryName(String subCategoryName){
        return subCategoryName;
     }

    public static void main(String[] args) {
        SubCategory subCategory=new SubCategory();
        System.out.println(subCategory.getSubCategoryName(""));
    }

}
