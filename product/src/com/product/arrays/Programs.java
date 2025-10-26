package com.product.arrays;

public class Programs {

    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6};

        //number%2==0
        //number%2!=0

    System.out.println("Even numbers");
      for (int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
              System.out.println(arr[i]);
          }
      }


        System.out.println("Odd numbers");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
