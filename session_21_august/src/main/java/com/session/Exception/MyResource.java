package com.session.Exception;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class MyResource implements AutoCloseable {



    static void method1(){
        throw  new ArithmeticException();
    }

    @Override
    public void close() throws IOException {

        System.out.println("closing the file ");
    }
}
