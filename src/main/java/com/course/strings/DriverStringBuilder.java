package com.course.strings;

public class DriverStringBuilder {
    public static void main(String[] args) {

        int count = 10;
        long startTime = System.currentTimeMillis();
        StringBuilder alphabet = new StringBuilder();
        for (int i = 97; i < 123;i++){
            alphabet.append((char)i);
            if(i == 122 && count-- != 0) i = 97;
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(alphabet.toString());
        System.out.println(finishTime - startTime + " ms");

    }
}
