package com.session.august28.set;

import com.session.august28.Collections.Student;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {

        Set<String> setHash = new HashSet<>();
        setHash.add("Ajay");
        setHash.add("Surinder");
        setHash.add("Shubham");
        setHash.add("Peter");

        System.out.println("****using iterator*****");
        Iterator<String> iterator = setHash.iterator();

        while(iterator.hasNext()){


            System.out.println(iterator.next());
        }

        System.out.println("*****after iterator****** ");


        Set<Student>  students = new TreeSet<>(Comparator.comparing(Student::getId));
        students.add(new Student("Mark","Brown",101));
        System.out.println(students);


        //System.out.println(setHash);






        // to retrieve the element from set we need to use the set.
        // red black tree
        // tree set it using

    }
}
