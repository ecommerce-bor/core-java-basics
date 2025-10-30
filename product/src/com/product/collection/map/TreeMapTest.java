package com.product.collection.map;

import com.product.collection.Employee;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        Map<Employee,Integer> treeMap=new TreeMap<>();

//        treeMap.put(null,1);
        treeMap.put(new Employee(1,"one"),1);
        treeMap.put(new Employee(2,"two"),2);

        for (Map.Entry<Employee,Integer> map:treeMap.entrySet()){
            System.out.println(map.getKey().toString()+map.getValue());
        }
    }
}
