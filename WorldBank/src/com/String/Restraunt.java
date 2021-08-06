package com.String;

public class Restraunt {

    void set(){

        System.out.println(this);// this calls the current class instance variable which is the object

    }

    public static void main(String[] args) {

        Restraunt r = new Restraunt();
        System.out.println(r); // printing the current class instance variable or object reference
        r.set(); // calling the set method

    }
}
