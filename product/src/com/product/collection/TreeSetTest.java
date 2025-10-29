package com.product.collection;

import com.product.ObjectClass.User;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
//        Set<Integer> treeSet=new TreeSet<>();
//
//        treeSet.add(5);
//        treeSet.add(3);
//        treeSet.add(8);
//
//        for(Integer tree:treeSet){
//            System.out.println(tree);
//        }

        TreeSet<Employee> userTreeSet=new TreeSet<>();

        userTreeSet.add(new Employee(1,"one"));
        userTreeSet.add(new Employee(1,"twe"));
        userTreeSet.add(new Employee(2,"two"));
        userTreeSet.add(null);

        for (Employee employee:userTreeSet){
            System.out.println(employee);
        }
    }
}
