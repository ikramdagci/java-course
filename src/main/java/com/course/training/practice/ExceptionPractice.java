package com.course.training.practice;

import com.course.exceptions.ex.MyCustomException;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class ExceptionPractice {

    public static void main(String[] args) {
//        g();
        test();
    }


    public static void test() {

        try {
            System.out.println("Hello world");
            f(); // ->
            System.out.println("Java");

        } catch (Exception e) {
            System.out.println("Hello catch!"); //->
        } finally {
            System.out.println("Hello finally");
        }

    }
    public static void f() throws MyCustomException{
        System.out.println("Hello f()");
        Random random = new Random();
        int i = random.nextInt(10);

        if(i != -1){
            throw new MyCustomException("Something went wrong");
        }

        System.out.println("f() finished");

    }

    public static void h() {
        try {
            f();
        } catch (MyCustomException e) {
            System.out.println("Something special for custom exception...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void f1() throws MyCustomException,FileNotFoundException,AWTException,IOException{
        System.out.println("Hello f()");
        Random random = new Random();
        int i = random.nextInt(10);

        if(i != -1){
            throw new MyCustomException("Something went wrong");
        }

        System.out.println("f() finished");

    }

    public static void g() {
        try {
            f1();
        } catch (FileNotFoundException e) {
            System.out.println("filenotfound");
        } catch (MyCustomException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e){

        }
    }

    public boolean isSuper(int number){
        boolean isSuper = false;



        return isSuper;
    }

}
