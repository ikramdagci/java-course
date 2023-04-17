package com.course.collections.main;

import com.course.collections.core.DataArray;
import com.course.polymorphism.domain.Circle;
import com.course.polymorphism.domain.Ellipse;
import com.course.polymorphism.domain.Rectangle;
import com.course.polymorphism.domain.Shape;
import com.course.training.multiple.inheritence.Student;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Driver {

    public final static PrintStream out = null;

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        testSetOut();
        test4();

    }

    public static void test5(){
        DataArray<Shape> dataArray = new DataArray<Shape>(10);

        dataArray.add(new Circle("Black",1));
        dataArray.add(new Rectangle("Black",5,5));
        //dataArray.add(new Student());

        Shape shape = dataArray.get(1);


    }

    public static void test4() {

        DataArray dataArray = new DataArray(10);

        dataArray.add(generateRandomShape());
        dataArray.add(generateRandomShape());
        dataArray.add(generateRandomShape());
        dataArray.add(generateRandomShape());


        for (int i = 0; i < dataArray.size(); i++) {
            Object o = dataArray.get(i);
            System.out.println(o.toString());
        }


    }

    public static void testSetOut() {
        System.out.println("Hello World");
        //System.setOut(new PrintStream(new File("my-console.txt")));
        System.out.println("Hello World");
    }

    public static void test3() {
        DataArray dataArray = new DataArray(5);

        for (int i = 0; i < 6; i++) {
            dataArray.add(i);
        }
        System.out.println(Arrays.toString(dataArray.getObjects()));
        dataArray.delete(2);
        dataArray.delete(4);
        System.out.println(Arrays.toString(dataArray.getObjects()));


        //dataArray.add(12);
        //System.out.println(Arrays.toString(dataArray.getObjects()));


    }

    public static void test2() {
        DataArray dataArray = new DataArray(10);

        for (int i = 0; i < 11; i++) {
            dataArray.add(generateRandomShape());
        }

        dataArray.add(new Student());
        dataArray.add("String");
        dataArray.add(1);

        Object[] objects = dataArray.getObjects();
        System.out.println(Arrays.toString(objects));
        Object o = dataArray.get(0);
        Shape s = null;
        if (o instanceof Shape) {
            s = (Shape) o;
        }
        s.draw();


    }

    public static Shape generateRandomShape() {
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0) {
            return new Circle("Black", 5.0);
        } else if (i == 1) {
            return new Rectangle("Black", 4, 5);
        } else {
            return new Ellipse("Black", 15, 25);
        }

    }

    public static void test1() {
        DataArray dataArray = new DataArray(10);

        for (int i = 0; i < 16; i++) {
            dataArray.add((int) (Math.random() * 100));
        }

        Object[] objects = dataArray.getObjects();
        System.out.println(Arrays.toString(objects));
        dataArray.delete(8);
        dataArray.delete(7);
        dataArray.delete(5);
        System.out.println(Arrays.toString(objects));
        dataArray.add(75);
        System.out.println(Arrays.toString(objects));

        Object o = dataArray.get(4);
        System.out.println(o);
    }




}
