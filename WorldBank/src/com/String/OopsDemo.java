package com.String;

class Demo{

    Demo(){



        //this(); // it will throw a compile time error as Recursive constructor invocation
        System.out.println("Hello def const");
    }

    Demo(int a, int b){


        this(); // call to the default constructor
        System.out.println("Hello Para const");

    }

}
public class OopsDemo {

    public static void main(String[] args) {

        Demo d = new Demo(10,10);



    }
}
