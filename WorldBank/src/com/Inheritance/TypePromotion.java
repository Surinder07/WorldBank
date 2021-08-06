package com.Inheritance;

public class TypePromotion {

    void sum(int a, int b){

        System.out.println("int arg method is invoked");
    }
    void sum(long a, long b){

        System.out.println("Long arg method is invoked");
    }

    public static void main(String[] args) {

        TypePromotion t = new TypePromotion();
       // t.sum(2.0,2.3);// this line will throw compile time error message/ ambiguity


    }

}
