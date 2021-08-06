package com.Inheritance;

class Address{
    String city, state, country;
    public Address(String city, String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
public class Emp {

    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){

        System.out.println(id+"-"+name);
        System.out.println(address.city+"-"+address.state+"-"+address.country);
    }
    public static void main(String[] args) {

        Address address1 = new Address("Toronto","ON","Canada");
        Address address2 = new Address("Scarborough","ON","Canada");

        Emp e1 = new Emp(101,"Surinder",address1);
        Emp e2 = new Emp(102, "Peter",address2);

        e1.display();
        e2.display();
    }
}
