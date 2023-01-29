package com.course.inner.example;

import com.course.polymorphism.domain.Circle;


public class Driver {

    public static void main(String[] args) {

        Sequence sequence = new Sequence(10);
        sequence.add(1);
        sequence.add(5);
        sequence.add("John");
        sequence.add("Doe");
        sequence.add(new Circle("Black",2.0));


        Iterator iterator = sequence.getIterator();

        while(!iterator.end()){
            Object current = iterator.current();
            System.out.println("Current : " + current.toString());
            iterator.next();
        }

        Iterator iterator1 = sequence.getIterator();

        while(!iterator1.end()){
            Object current = iterator1.current();
            System.out.println("Current : " + current.toString());
            iterator1.next();
        }


    }

}
