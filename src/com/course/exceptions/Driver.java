package com.course.exceptions;

import com.course.exceptions.domain.MyLibrary;
import com.course.exceptions.ex.MyCustomException;
import com.course.exceptions.ex.ScreenRenderException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Driver {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
//        test2();
//        test3(); //throws!
//        test4();
        try {
            MyLibrary.f(1,2);
        } catch (MyCustomException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            e.initCause(new ScreenRenderException());
            e.fillInStackTrace();
            e.printStackTrace();
            String message = e.getMessage();
            String localizedMessage = e.getLocalizedMessage();
            System.out.println(localizedMessage);

        }

    }

    public static void test6(){
        try {
            f();
            g();
        } /*catch (Throwable e) {

        }*/ catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test5(){
        try {
            f();
            g();
        } catch (MyCustomException e) {
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test4(){
        try {
            f();
            g();
        } catch (MyCustomException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void g() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void test3() throws MyCustomException{
        f();
    }

    public static int f() throws MyCustomException {
        System.out.println("f() is running...");
        throw new MyCustomException("Something went wrong");
    }


    public static void test2() throws FileNotFoundException {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Result : " + result);
        } catch (Exception e) {
            //StackTraceElement[] stackTrace = e.getStackTrace();
            e.printStackTrace(new PrintStream("error.log"));
            e.printStackTrace();
            System.err.println(e.getMessage());
            //test2();
            // resumption
        }



    }
    public static void test1(){
        try {
            // vulnerable code block
        } catch (Exception e) {
            // exception handling
        }

    }

    public static void test(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Vulnerable
        System.out.println(a / b);

        System.out.println("Enter username: ");
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(s);
    }

}
