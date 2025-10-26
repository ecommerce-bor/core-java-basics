package com.product.collection;

import com.product.encapsulation.User;
import com.product.inheritance.Item;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {


    public static void main(String[] args) {
        List<User> linkedList=new LinkedList<>();

        linkedList.add(new User(1,"kumar"));
        linkedList.add(new User(2,"nikhil"));
        linkedList.add(new User(3,"siva"));
        linkedList.add(new User(4,"ram"));
        linkedList.add(new User(5,"kasmir"));
        linkedList.add(new User(6,"nikhil"));
//        linkedList.remove(new User(6,"nikhil"));

//        for (User user:linkedList){
//            System.out.println(user);
//            linkedList.remove(new User(6,"nikhil"));
//        }

//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());

        Iterator<User> iterator=linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
