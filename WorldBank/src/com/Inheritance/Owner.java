package com.Inheritance;

public class Owner {


    int id;
    String name;
    Address address;

    public Owner(int id, String name, Address address){

        this.id = id;
        this.name = name;
        this.address = address;

    }

    public void showDetails(){
        System.out.println(id+"-"+name);
        System.out.println(address.city+"-"+address.state+"-"+address.country);
    }

    public static void main(String[] args) {

        Address address1 = new Address("Delhi","Delhi","India");
        Address address2 = new Address("Brampton","ON","Canada");

        Owner o1 = new Owner(1001,"Surinder",address1);
        Owner o2 = new Owner(1002,"Singh",address2);

        o1.showDetails();
        o2.showDetails();

    }
}
