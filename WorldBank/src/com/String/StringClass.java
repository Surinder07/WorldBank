package com.String;

public class StringClass {
    public static void main(String[] args) {


        String st1 = "Surinder";

        String name = new String("Surinder");

        char[] data = {'S','U','R','I','N','D','E','R'};
        String st2 = new String(data);

        System.out.println(st1);
        System.out.println(st2.toLowerCase());
        System.out.println(name);

        String c = "Surinder".toLowerCase();
        System.out.println(c);

        System.out.println(c.isEmpty());

        System.out.println(c.valueOf(c));


        if(c.isEmpty()){

            System.out.println("Enter some value");
        }

        else{

            System.out.println("Enter your name again ?");
        }
        String f = "abc".substring(0,1);
        // this string returns nothing if we start it from 0 to 1 ?
        // what should be the first index from where the string starts ?





    }
}
