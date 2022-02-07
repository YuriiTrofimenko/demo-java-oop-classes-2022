package org.tyaa.demo.javase.classes;

import org.tyaa.demo.javase.classes.models.Person;
import org.tyaa.demo.javase.classes.models.Producer;
import org.tyaa.demo.javase.classes.models.Supplier;

public class ClassesApp {
    public static void main(String[] args) {
        // System.out.println("Hello Java!");
        // System.out.println(Randomizer.getRandomInt());
        Person[] people =
            {
                new Producer("SkyNet", "-", "Robots"),
                new Supplier("John", "Connor", "USA"),
                new Person("Bill", "Gates") {
                    @Override
                    public Object getDetails() {
                        return toString() + " + " + "(Anonymous Object Inherited from Person)";
                    }
                }
            };
        for (Person person : people) {
            System.out.println(person.getDetails());
            if (person instanceof Producer) {
                System.out.println("I'am a Producer");
            } else if (person instanceof Supplier) {
                System.out.println("I'am a Supplier");
            } else {
                System.out.println("I'am smth else!");
            }
            System.out.println();
        }
    }
}