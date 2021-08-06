package com.Inheritance;

class Bank {


    float gerInterestRate(){
        return 0;
    }

}
class Rbc extends  Bank{

    @Override
    float gerInterestRate() {

        return 5.99f;
    }
}
class Cibc extends Bank{

    @Override
    float gerInterestRate() {
        return 6.99f;
    }
}
class Scotia extends  Bank{

    @Override
    float gerInterestRate() {
        return 5.49f;
    }
}

public class BankRuntimePoly {
    public static void main(String[] args) {

        Bank b; // reference of bank object pointing to the object of the child class

        b = new Rbc(); // upcasting
        System.out.println("RBC bank interest rate : "+b.gerInterestRate());

        b= new Cibc();
        System.out.println("Cibc bank interest rate : "+b.gerInterestRate());

        b = new Scotia();
        System.out.println("Scotia bank interest rate : "+b.gerInterestRate());
    }
}
