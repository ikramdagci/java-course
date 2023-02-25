package com.course.collections.main;

import com.course.collections.domain.Apple;
import com.course.collections.domain.Orange;

import java.util.ArrayList;

public class DriverCollections {

    /*
     Abstract Data Types - ADT

     - List
     - Set
     - Queue

     - Map

     */

    public static void main(String[] args) {



    }

    public static void test1(){
        ArrayList<Apple> apples = new ArrayList<Apple>();

        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
//        apples.add(new Orange()); // compile error



        for (int i = 0; i < apples.size(); i++) {
            Object o = apples.get(i); // unnecessary
            Apple apple = (Apple)o;   // safe but unnecessary
            Apple apple1 = apples.get(i); // ---- !!! ----
            int id = apple1.getId();
            System.out.println("Apple id : " + id);
        }

    }
    public static void test(){
        ArrayList apples = new ArrayList();

        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Orange()); /// !!!!!!



        for (int i = 0; i < apples.size(); i++) {
            Object o = apples.get(i);
            Apple apple = (Apple)o;  // may occur class cast exception
            int id = apple.getId();
            System.out.println("Apple id : " + id);
        }

    }


    /*
    static Object[] elementData = new Object[10];
    static int cursor;
    public static void add(Apple apple){
        elementData[cursor++] = apple;
    }

    public static Apple get(int index){
        return (Apple)elementData[index];
    }
*/
}
