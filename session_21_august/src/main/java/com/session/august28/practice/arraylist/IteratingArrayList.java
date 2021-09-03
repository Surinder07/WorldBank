package com.session.august28.practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Surinder");
        list.add("SAchin");
        list.add("Sunny");
        list.add("Surinder");

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------------");


        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=================================");
        System.out.println("Iterating using Iterator");
        System.out.println("=================================");


        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        ListIterator<String> l = list.listIterator();

        while (l.hasNext()){

            System.out.println(l.next());
            l.add("Rajan");
        }



    }
}
