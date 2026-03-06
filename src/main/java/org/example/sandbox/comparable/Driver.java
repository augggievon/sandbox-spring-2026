
package org.example.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        person person1 = new person("John", "Doe", 30);
        person person2 = new person("Jane", "Doe", 25);
        person person3 = new person("John", "Smith", 35);
        person person4 = new person("Jane", "Smith", 40);
        person person5 = new person("Bob", "Smith", 40);

        List<person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        personList.forEach(System.out::println);

        Collections.sort(personList);

        personList.forEach(System.out::println);


    }
}
