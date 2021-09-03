package com.session.august28.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

    String name;
    int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

}

 class ArrayListDemo {

    public static void main(String args[]) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 29));
        list.add(new Employee("Alex", 54));


        System.out.println("ArrayList in asc order: " + list);
    }
}