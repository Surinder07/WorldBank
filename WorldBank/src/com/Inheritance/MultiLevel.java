package com.Inheritance;

// Multilevel inheritance
class Animal{
    public void eat(){
        System.out.println("ALl the animals can eat");
    }
}
class Dog extends  Animal{
    public void eatPedigree(){

        System.out.println("All dogs eat pedigree");
    }
}
class Labrador extends  Dog{
    public void eatPedi(){

        System.out.println("Labrador only eats pedigree from PETVALU");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Labrador l = new Labrador();
        l.eat();
        l.eatPedigree();
        l.eatPedi();
    }
}
