package com.session.august28.Map;

import com.session.august28.Collections.Student;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        /*
        Map<String, Student> map = new HashMap<>();
        map.put("Surinder",new Student("Surinder","Singh",2));

        map.put(null,new Student("Surinder","Singh",2));

        map.put(null,new Student("Surinder","Singh",2));
        System.out.println(map);

        System.out.println(map.get(null));

        System.out.println(map.containsKey(null));

        //System.out.println(map.containsValue(new Student("Surinder","Singh",106)));
*/

        String st = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        Map<Character,Integer> map2 = new HashMap<>();

        char[]  ch = st.toCharArray();

        for (int i = 0; i <ch.length; i++) {
            map2.compute(ch[i], (k,v)->v==null?0:v+1);
        }

        System.out.println(map2);







    }
}
