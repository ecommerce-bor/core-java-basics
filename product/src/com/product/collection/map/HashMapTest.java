package com.product.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("A.p",1);
        map.put("Hyderabad",2);
        map.put(null,3);
        map.put(null,4);
        map.put("A.p",2);

        for (Map.Entry<String,Integer> states:map.entrySet()){
            System.out.println("key is: "+states.getKey()+"value is: "+states.getValue());
        }


    }
}
