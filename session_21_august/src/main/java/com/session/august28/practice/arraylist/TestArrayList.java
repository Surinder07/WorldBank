package com.session.august28.practice.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Surinder");
        list.add("SAchin");
        list.add("Sunny");
        list.add("Surinder");

        list.remove(1);
        list.remove("Surinder");
        System.out.println(list);



        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(243);
        list2.add(76);
        list2.add(5);
        list2.add(76);

        System.out.println("before remove : "+list2);


        System.out.println(list2);




    }
}
