package com.session.Exception;

public class ExceptionDemo {
    public void method1(){
        System.out.println(2/0);
    }
    public void method2(){
        method1();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("before the method call !");
         ExceptionDemo e = new ExceptionDemo();
        System.out.println("After creating object");
         e.method2();
        System.out.println("After the method calls ! ");
    }
}
