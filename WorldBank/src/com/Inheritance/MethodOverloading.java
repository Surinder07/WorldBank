package com.Inheritance;

class Adder{

    static long add(int a, long b ){

        return  a+b;

    }
    static double add(double a, int b , int c){


        return a+b+c;
    }

}
public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(Adder.add(2, 2));
        System.out.println(Adder.add(2, 3, 4));


    }
}
