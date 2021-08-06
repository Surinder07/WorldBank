package com.PragraVideos.String;

import java.nio.file.Path;

public class PracticeStrings {
    public static void main(String[] args) {

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.name"));

        String st = "adkagbsd";
        System.out.println(st.substring(0,3));

        String delta = "So, the Delta variant is a variant of concern that WHO is tracking and monitoring around the world. It's a variant of concern because we know it has increased transmissibility. This has been demonstrated by several countries. And we know that where the Delta variant is identified, it really rapidly takes off and spreads between people more efficiently than even the Alpha variant that was first detected around December, January 2021. As of today, the Delta variant has been reported in 96 countries and we expect that the Delta variant will continue to spread. There are a number of factors that are contributing to increased transmission around the world. The first are these variants of concern, including the Delta variant. The second factor is that we have increased social mixing and increased social mobility, which increases the number of contacts that individuals have. The third factor is the relaxation or the inappropriate use of public health and social measures. Proven public health and social measures that we know prevent infections, reduce the spread of somebody who is infected with the virus to others and " +
                "save lives. And the fourth factor is the uneven and inequitable distribution of vaccines ";



        char input = 'd';

        int count = 0;

        for (int i = 0; i < delta.length(); i++) {
            if (delta.charAt(i) == input) {
                count++;
            }
        }
        System.out.println(count);







    }

}


