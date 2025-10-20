package com.product.abstraction;

public abstract class ItemRepository {

   private Integer id;
   private String name;

    public ItemRepository(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract Boolean existsByName(String name);

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
