package com.session.Exception;

import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;

import java.io.IOException;

public class TestRun extends Object{
    public static void main(String[] args) {


        try(MyResource resource = new MyResource()){


        }

         catch (IOException e) {
            e.printStackTrace();
        }

    }



}
