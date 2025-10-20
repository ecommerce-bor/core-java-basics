package com.product.abstraction;

public class ElectronicsRepository extends  ItemRepository{

    public ElectronicsRepository(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Boolean existsByName(String name) {
        if(name.equals("Laptop")) {
            return true;
        } else if (name.equals("Mobile")) {
        return true;
        } else {
            return false;
        }
    }
}
