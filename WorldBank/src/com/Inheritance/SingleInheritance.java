package com.Inheritance;

class BaseClass{

    int a = 10;
    public void set(){
        System.out.println("Base class method call ");
    }
}
class DerivedClass extends  BaseClass{

    public void setAgain(){

        System.out.println("Derived class method call ");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {

        // created object of the derived class and calling both the methods
        // reused the code
        DerivedClass d =  new DerivedClass();
        d.set();
        d.setAgain();
    }
}
