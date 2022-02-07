package org.tyaa.demo.javase.classes.models;

public class Supplier extends Person {

    private String address;

    public Supplier(String name, String lastName, String address) {
        super(name, lastName);
        this.address = address;
    }

    @Override
    public Object getDetails() {
        return super.toString() + " + " + "Address: " + address;
    }
}
