package com.AbstractionInterface;


abstract class Bike{

    abstract  void set();

}
class Honda extends  Bike{


    @Override
    void set() {
        System.out.println("Bike is running ");
    }
}


public class AbstractionDemo {
    public static void main(String[] args) {

        Bike b = new Honda();
        b.set();

    }
}
