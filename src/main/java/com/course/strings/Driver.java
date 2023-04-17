package com.course.strings;

public class Driver {

    public static void main(String[] args) {


//        init();
//        test1();

        KomodoDragon komodoDragon = new KomodoDragon(13,3.76,18.5);
        String s = komodoDragon.toString();
        System.out.println(s);
        System.out.println(komodoDragon);
        int length = "TestStrting".length();



    }

    public static void init() {
        String str = "abc";// string literal
        String str1 = new String("abc"); // immutable
        String str2 = "abc";
        String str3 = new String("abc");


        System.out.println(str.toUpperCase());
        System.out.println(str);

        if (str == str1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        if (str == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (str1 == str3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String password = "seCrTtPw";
        validate(password);
        System.out.println(password);

        System.out.println(str.equals(str1));
    }

    public static void validate(String pw) {
        String s = pw.toLowerCase();
        String secretHash = pw.concat("secretHash");
        System.out.println(secretHash);
    }

    private static void test() {
        String str = "str";

        char a = 'a';
        char b = 'b';
        char c = 'c';
        char d = 'd';

        char[] chars = {'s', 't', 'r', a, b, c};

        String s = String.valueOf(chars);
        System.out.println(s);


        String anotherStr = str + "a" + "b" + "c" + 45 + "d";
        /*
        str
        a
        stra
        b
        strab
        c
        strabc
        45
        strabc45
        d
        strabc45d
         */


    }

    private static void test1() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("str");
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        stringBuilder.append("d");

        String s = stringBuilder.toString();
        System.out.println(s);


    }


}
