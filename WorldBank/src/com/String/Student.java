package com.String;

// constructor chaining
public class Student {
    int rollno;
    String name, course;
    float fees;

    Student(int rollno, String name, String course){


        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    Student(int rollno, String name, String course, float fees){


        this(rollno,name, course);
        this.fees = fees;
    }
    void display(){
        System.out.println("hello");
        System.out.println(rollno+"-"+name+"-"+course+"-"+fees);
    }
    public static void main(String[] args) {

        Student s1 = new Student(111,"Surinder","Java");
        Student s2 = new Student(101,"Singh","Maths",6000);


       s1.display();
       s2.display();


    }
}
