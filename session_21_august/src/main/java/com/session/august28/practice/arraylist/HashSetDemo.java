package com.session.august28.practice.arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Yes");
        set.add("what");
        set.add("Npo");




        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }
}
