package com.session.generics;

public class Calculator<T> {

    private T a ;
    private T  b;

    public void sum(T a, T b){
        System.out.println("printing the values of : "+a+"-"+b);
    }

    public void stringDiplay(T s1, T s2){
        System.out.println(s1+"-"+s2);
    }


}
