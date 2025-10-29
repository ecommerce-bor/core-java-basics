package com.product.collection.map;

import com.product.collection.Employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        Map<Employee,Integer> employeeMap=new LinkedHashMap<>();

        employeeMap.put(new Employee(1,"ds"),1);
        employeeMap.put(new Employee(2,"DE"),2);
        employeeMap.put(null,3);
        employeeMap.put(null,4);
        employeeMap.put(new Employee(2,"DE"),3);


        for (Map.Entry<Employee,Integer> employee:employeeMap.entrySet()){
            System.out.println(employee.getKey()+"   "+employee.getValue());
        }
    }
}
