package com.session.august28.Collections;

public class Student {

    private String firstName;
    private String lastName;
    private  int id;

     public Student(String firstName, String lastName, int id) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.id = id;
     }

     public int getId() {
          return id;
     }

     @Override
     public String toString() {
          return "Student{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  '}';
     }
}
