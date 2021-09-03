package com.session.august28.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRun {
    public static void main(String[] args) {

        Student student = new Student("Surinder","Singh",105);
        Student student1 = new Student("Ajay","Sharma",106);


        List<Student> s1 = new ArrayList<>();
        s1.add(student);
        s1.add(student1);


        s1.sort((a,b)->b.toString().length()-a.toString().length());

        System.out.println(s1);



//
//        System.out.println(s1);
//
//        System.out.println(s1.contains(student));
//
//        Iterator<Student> newStudent = s1.iterator();
//
//        while (newStudent.hasNext()){
//
//            System.out.println(newStudent.next());
//
//        }
        
        
         


    }
}


        /*
        index of
        crate t a class called stundent
        and firt anema dn alst name
        and add couple of stundents
        //implemtn equals and hashcode
        contains all and contains
        iterator
        Of methods
        retain all


        set modifies the value at particular location/index

        SET:
        it is a unique collection and wont allow duplicates

         */