package com.session.generics;

public class TestingRun {
    public static void main(String[] args) {

        Calculator<Integer> calculator = new Calculator<>();
        calculator.sum(2,3);

        Calculator<String> c2 = new Calculator<>();
        c2.sum("Hello ","change juar brain metallity ");


        Calculator<Boolean> b = new Calculator<>();
        b.sum(true,false);

        Calculator<Character> ch = new Calculator<>();
        ch.sum('a','b');
    }
}
