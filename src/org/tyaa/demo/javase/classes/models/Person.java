package org.tyaa.demo.javase.classes.models;

public abstract class Person {

    // private static Integer lastId = 0;
    private static Integer lastId;

    static {
        // lastId = 0;
        Person.lastId = 0;
    }

    private Integer id;
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.id = ++lastId;
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract Object getDetails();

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
    }
}
