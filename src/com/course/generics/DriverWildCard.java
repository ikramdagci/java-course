package com.course.generics;

import com.course.polymorphism.domain.fields.A;

import java.util.ArrayList;

public class DriverWildCard {

    Integer i = 5;
    Number i1 = 5;

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(new Integer(5));
        print(numbers);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        print(integers);

//        printS(integers);
        printS(numbers);

    }

    /*
    public static void print(ArrayList<Number> numbers){
        for (Number number : numbers) {
            System.out.println(number);
        }
    }*/

    public static void print(ArrayList<? extends Number> arrayList){

    }

    public static void printS(ArrayList<? super Number> arrayList){

    }

}
