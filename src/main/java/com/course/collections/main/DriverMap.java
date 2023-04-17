package com.course.collections.main;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.*;

public class DriverMap {

    public static final Object DUMMY_OBJECT = new Object();

    public static void main(String[] args) {
//        test2();
//        test1();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test8();
    }

    private static void test8() {
        String str = "ankara";
        HashMap<Character, Object> hashMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        char[] chars = str.toCharArray();
        for(char ch : chars) {
            hashMap.put(ch,DUMMY_OBJECT);
            set.add(ch);
        }




    }


    private static void test7() {
        HashMap<Character, Object> hashMap = new HashMap<>();

        hashMap.put('a',DUMMY_OBJECT);
        hashMap.put('a',DUMMY_OBJECT);
        hashMap.put('b',DUMMY_OBJECT);
        hashMap.put('c',DUMMY_OBJECT);

        Set<Character> characters = hashMap.keySet();
        for(char c : characters) {
            System.out.print(c + ", ");
        }
    }

    private static HashMap<Integer, String> createCityPlateMap() {
        HashMap<Integer, String> cityPlateMap = new HashMap<>();
        cityPlateMap.put(25, "Erzurum");
        cityPlateMap.put(54, "Sakarya");
        cityPlateMap.put(61, "Trabzon");

        return cityPlateMap;
    }



    private static void test6() {
        HashMap<Integer, String> cityPlateMap = createCityPlateMap();

        Set<Map.Entry<Integer, String>> entries = cityPlateMap.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            Integer key = entry.getKey();
            String value = entry.getValue();

        }


    }




    private static void test5() {
        HashMap<Integer, String> cityPlateMap = createCityPlateMap();

        Collection<String> values = cityPlateMap.values();

        for(String str : values){
            System.out.println(str);
        }


    }

    private static void test4() {
        HashMap<Integer, String> cityPlateMap = createCityPlateMap();
        cityPlateMap.put(61, "Mardin");

        String s1 = cityPlateMap.get(5); // null

        Set<Integer> keys = cityPlateMap.keySet();
        Iterator<Integer> iterator = keys.iterator();
        System.out.println(iterator);
        while(iterator.hasNext()){
            int key = iterator.next();
            System.out.println(key);
            String value = cityPlateMap.get(key);
            System.out.println(value);
        }
    }

    private static void test3() {

        HashMap<Integer, String> cityPlateMap = createCityPlateMap();
        Set<Integer> keys = cityPlateMap.keySet();

        for(int key : keys){
            String s = cityPlateMap.get(key);
            System.out.println(s);
        }

        Iterator<Integer> iterator = keys.iterator();
        while(iterator.hasNext()){
            int key = iterator.next();
            String s = cityPlateMap.get(key);
            System.out.println(s);
        }


    }


    private static void test2() {
        int a = 1 << 30;
        String s = Integer.toBinaryString(a);
        System.out.println(a);
        System.out.println(s);
    }

    private static void test1() {
        HashMap<Integer, String> cityPlateMap = createCityPlateMap();

        int[] keys = {25, 54, 61};


        for (int i = 0; i < keys.length; i++) {
            int key = keys[i];
            String s = cityPlateMap.get(key);
            System.out.println(s);
        }


    }


    public void printCities(HashMap<Integer, String> cityPlateMap){

        int[] keys = {25, 54, 61};

        for (int i = 0; i < keys.length; i++) {
            int key = keys[i];
            String s = cityPlateMap.get(key);
            System.out.println(s);
        }
    }




}
