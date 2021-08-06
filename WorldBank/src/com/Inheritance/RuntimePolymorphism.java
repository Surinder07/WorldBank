package com.Inheritance;

 class Bike {
     void run(){
         System.out.println("Running  ");
     }

 }
 class  Honda extends  Bike{
     @Override
     void run() {
         System.out.println("running with 160 KM speed");
     }
 }

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Bike b = new Honda(); // this is upcasting
        b.run();

    }
}
