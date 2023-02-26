package com.course.collections.main;

import com.course.collections.domain.CustomPersonComparator;
import com.course.collections.domain.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DriverSet {

    // TODO: 26.02.2023 practice primal search engine
    String content = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots ...";

    public static void main(String[] args) {
//        test1();
//        test2();
//        test4();
//        test3();
//        test5();
//        test6();
//        test7();
        test8();

    }

    public static void test8(){
        CustomPersonComparator customPersonComparator = new CustomPersonComparator();
        TreeSet<Person> people = new TreeSet<>(customPersonComparator);
        people.add(new Person("John","AB"));
        people.add(new Person("John2","DZ"));
        people.add(new Person("John3","AC"));
        System.out.println(people);
    }

    public static void test7(){
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("John","AB"));
        people.add(new Person("John2","DZ"));
        people.add(new Person("John3","AC"));
        System.out.println(people);


    }

    public static void test6(){
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(1);
        integers.add(12);
        integers.add(25);
        integers.add(39);
        integers.add(11);
        integers.add(98);
        System.out.println(integers);
    }

    public static String getDuplicatedChars(String s){
        // TODO: 26.02.2023 homework
        return null;
    }

    public static void test5(){
        Person johnDoe = new Person("John Doe", "123");
        Person robertHayley = new Person("Robert Hayley", "234");
        Person ismailKoybasi = new Person("Ismail Koybasi", "987");
        Person x = new Person("John Doe", "123");
        HashSet<Person> people = new HashSet<Person>();
        boolean add = people.add(johnDoe);
        boolean add1 = people.add(robertHayley);
        boolean add2 = people.add(ismailKoybasi);
        boolean add3 = people.add(x);

        System.out.println(add);
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(add3);


        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
        }

        for(Person person : people){
            System.out.print(person.getName() + ", ");
        }




    }

    public static void test4(){
        String s = new String("Test");
        String s1 = new String("Test");

        System.out.println(s == s1); // false
        System.out.println(s.equals(s1)); // true
    }

    public static void test3(){
        HashSet<String> strings = new HashSet<String>();
        strings.add("A");
        strings.add("B");
        System.out.println(strings);
        strings.add("A");
        System.out.println(strings);

    }

    public static void test2(){

        Person johnDoe = new Person("John Doe", "123");
        Person robertHayley = new Person("Robert Hayley", "234");
        HashSet<Person> people = new HashSet<Person>();
        people.add(johnDoe);
        people.add(robertHayley);

        Person johnDoe1 = new Person("John Doe", "123");

        System.out.println(johnDoe.equals(johnDoe));
        System.out.println(johnDoe.equals(johnDoe1));

        people.add(johnDoe1);


        System.out.println(people);




    }

    public static void test1(){
        HashSet<Integer> integers = new HashSet<>();
        integers.add(4);
        integers.add(1);
        integers.add(12);
        integers.add(25);
        integers.add(39);
        integers.add(11);
        integers.add(98);
        System.out.println(integers);
        integers.add(12);
        System.out.println(integers);
    }

}
