package com.Inheritance;


class Computer{

    String color ="white";

    Computer(){

        System.out.println("Computer class constructor is called ");
    }

    void ramSize(){

        System.out.println("my computer has RAM size of 10 GB ");
    }

}
class Laptop extends Computer{


    Laptop(){

        super(); // super is used to call the constructor of the parent class Computer
    }

    String color = "black";
    void ramSize(){  // this method has been extended from the computer class

        super.ramSize(); // this will call ramSize mthod of the computer class and prints 10 GB
        System.out.println("My laptop has RAM size of 40 GB");

    }

    void printColor(){

        System.out.println(color); // prints color of the current class which is Laptop
        System.out.println(super.color);//  prints the color of the parent class which is computer
    }

}

public class SuperKeyword {
    public static void main(String[] args) {

        Laptop l = new Laptop();
        l.printColor();

        l.ramSize();
    }
}
