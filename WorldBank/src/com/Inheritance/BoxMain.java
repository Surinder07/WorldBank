package com.Inheritance;



class Box{

    private int height;
    private int width;
    private int length;


    public int volume(){


        return this.height * this.length * this.length;
    }

}
public class BoxMain {
    public static void main(String[] args) {

        Box b = new Box();
        System.out.println(b.volume());

    }
}
