package com.product.abstraction;

public class BookRepository extends ItemRepository{
    public BookRepository(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Boolean existsByName(String name) {
        if(name.equals("Telugu")){
            return true;
        }else{
            return false;
        }
    }
}
