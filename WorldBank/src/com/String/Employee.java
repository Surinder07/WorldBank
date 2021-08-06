package com.String;

public class Employee {


    private int timeIn;
    private  int age;
    Employee salary(){



        return  this;// what does this block of code means ???
    }

    void msg(){

        System.out.println("hello Java");
    }


    public static void main(String[] args) {

       new Employee().salary();
        System.out.println();


    }
}
