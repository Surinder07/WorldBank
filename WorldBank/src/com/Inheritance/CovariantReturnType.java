package com.Inheritance;

class Phone{

            Phone get(){ //

                return this;
            }
}
class Handheld extends Phone{ // class Handheld inherits from Phone

    @Override
    Handheld get() {  // this method has different return type than Phone get()
                return this;

    }
    void message(){
        System.out.println("Welcome to covariant return type");
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {

        new Handheld().get().message();
    }
}
