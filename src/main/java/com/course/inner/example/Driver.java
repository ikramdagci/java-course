package com.course.inner.example;

import com.course.polymorphism.domain.Circle;


public class Driver {

    public static void main(String[] args) {

        Sequence sequence = new Sequence(10);
        sequence.add(1);
        sequence.add(5);
        sequence.add("John");
        sequence.add("Doe");
        Circle black = new Circle("Black", 2.0);
        sequence.add(black);


        Iterator iterator = sequence.getIterator();
        Iterator iterator1 = sequence.getReverseIterator();

        Driver.printAllElements(iterator1);



        /*Iterator iterator1 = sequence.getIterator();

        while(!iterator1.end()){
            Object current = iterator1.current();
            System.out.println("Current : " + current.toString());
            iterator1.next();
        }*/


    }
    public static void printAllElements(Iterator iterator){
        while(!iterator.end()){
            Object current = iterator.current();
            System.out.println("Current : " + current.toString());
            iterator.next();
        }
    }


}
