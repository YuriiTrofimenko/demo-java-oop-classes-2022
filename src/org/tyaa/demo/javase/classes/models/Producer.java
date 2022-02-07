package org.tyaa.demo.javase.classes.models;

public class Producer extends Person {

    private String goodsCategory;

    public Producer(String name, String lastName, String goodsCategory) {
        super(name, lastName);
        this.goodsCategory = goodsCategory;
    }

    @Override
    public Object getDetails() {
        return super.toString() + " + " + "Category of goods: " + goodsCategory;
    }
}
