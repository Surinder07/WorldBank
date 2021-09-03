package com.session.Exception;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        userInfo();
    }


    public static void userInfo() {

        String firstName = "";
        String lastName = "";
        int langCode = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Last Name : ");
        lastName= scanner.next();



        if(langCode >=0 && langCode <=4) {
            throw new InvalidNameException("lang code should between 0 and 4 ");

        }




    }

}
