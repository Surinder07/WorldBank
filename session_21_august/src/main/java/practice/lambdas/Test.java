package practice.lambdas;

import java.util.*;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();
        guestList.add("Surinder");
        guestList.add("Sunny");

        System.out.println(guestList);



        guestList.add("Ajay");
        System.out.println(guestList);

        guestList.add(3,"Kartan");

        System.out.println(guestList);

        List<String> vip = Arrays.asList("sachin","dhoni","sehwag");
        guestList.addAll(vip);

        System.out.println(guestList);
        System.out.println(guestList.indexOf("Ajay"));

        List<Student> st = new ArrayList<>();
        st.add(new Student("Surinder","singh"));
        System.out.println(st);




    }

}
