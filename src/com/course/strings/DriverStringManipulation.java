package com.course.strings;

public class DriverStringManipulation {

    public static void main(String[] args) {

        int count = 10;
        long startTime = System.currentTimeMillis();
        String alphabet = "";
        for (int i = 97; i < 123;i++){
            alphabet = alphabet + ((char)i);
            if(i == 122 && count-- != 0) i = 97;
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(alphabet);
        System.out.println(finishTime - startTime + " ms");


    }

}
