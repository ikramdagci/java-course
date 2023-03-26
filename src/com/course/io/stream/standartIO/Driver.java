package com.course.io.stream.standartIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Driver {

    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream("new-console"));
        System.setIn(new FileInputStream("people"));
        System.setErr(new PrintStream("error-log"));

        System.out.println("Hello world!");
        test();
    }

    public static void test(){
        throw new RuntimeException();
    }

}
