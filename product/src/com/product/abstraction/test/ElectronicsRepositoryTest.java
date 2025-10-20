package com.product.abstraction.test;

import com.product.abstraction.BookRepository;
import com.product.abstraction.ElectronicsRepository;
import com.product.abstraction.ItemRepository;

public class ElectronicsRepositoryTest {

    public static void main(String[] args) {

//        ItemRepository itemRepository=new ElectronicsRepository(1,"Electronics");
//        Boolean itemStatus=itemRepository.existsByName("Laptop");
//        System.out.println(itemStatus);
//
//        ItemRepository itemRepository1=new BookRepository(1,"Books");
//        Boolean bookStatus=itemRepository1.existsByName("nothing");
//        System.out.println("bookStatus: "+bookStatus);

        ItemRepository itemRepository2=new ItemRepository(1,"Electronics") {
            @Override
            public Boolean existsByName(String name) {
                return null;
            }
        };
        Integer id=itemRepository2.getId();
        System.out.println(id);


    }
}
