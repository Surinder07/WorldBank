package com.Inheritance;

 class Testing{

      Testing(){
         System.out.println("This is the constructor ");
     }

    {
        System.out.println("Hello this is the first statement to be executed");
    }
}
public class InstanceInitialzerBlock {
    public static void main(String[] args) {
        Testing t = new Testing();

    }
}
