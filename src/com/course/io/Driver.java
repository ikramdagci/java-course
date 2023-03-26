package com.course.io;

import com.course.io.domain.test.PersonList;

import java.io.File;


public class Driver {


    public static void main(String[] args) {
        //{}

        // char-oriented -> 16-bit
        // byte-oriented -> 8-bit

        // persistence

        testFile();


    }

    public static void testFile(){
        File file = new File("C:\\Users\\ikramd\\default-soapui-workspace.xml");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        File file1 = new File(".");
        String path = file1.getPath();
        System.out.println("relative:" + path);
        System.out.println(file1.getAbsolutePath());


    }

    public static void testPersonPersistence(){
        PersonList personList = new PersonList();
        personList.start();
//        personList.readFile();
    }



}
