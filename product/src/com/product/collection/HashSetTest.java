package com.product.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<>();

        hashSet.add(1001);
        hashSet.add(1002);
        hashSet.add(1003);
        hashSet.add(1005);
        hashSet.add(1006);
        hashSet.add(1007);
        hashSet.add(1008);

        hashSet.add(1008);
        hashSet.add(1005);
        hashSet.add(null);

        for(Integer elements:hashSet){
            System.out.println(elements);
        }

//        Integer[] arr={1,1,2,3,4,5,6,7,8,9};
//
//      List<Integer> arrayList= Arrays.asList(arr);
//        Set<Integer> eliminateDuplicates = new HashSet<>(arrayList);
//
//      for (Integer set:eliminateDuplicates){
//          System.out.println(set);
//      }



    }
}
