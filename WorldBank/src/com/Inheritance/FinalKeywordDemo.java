package com.Inheritance;


class Mobile
{
    final Long MOBILE_NUMBER; // blank final variable is initialized in the constructor
    static final Double price; // blank final static variable , it is not initialized here.


    static{

        price = 7654.00;// initialized blank final static variable

    }


     Mobile(){

        MOBILE_NUMBER = 1245788956l;// initialized in the const

    }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {


    }
}
