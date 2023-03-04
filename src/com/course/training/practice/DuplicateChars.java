package com.course.training.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateChars {

    public static void main(String[] args) {
        String ankara = new DuplicateChars().getDuplicateChars("anqaraq");
        System.out.println(ankara);

    }
    //aa
    public String getDuplicateChars(String givenString) {
        String result = "";
        char[] chars = givenString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) {
                    boolean contains = this.contains(result.toCharArray(), chars[i]);
                    if (!contains) {
                        System.out.println("Adding duplicate char");
                        result += chars[i];
                    }

                }
            }
        }
        return result;
    }

    public String getDuplicateChars2(String givenString) {
        ArrayList<Character> arrayList = new ArrayList<>();
        char[] chars = givenString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) {
                    boolean contains = this.contains(arrayList, chars[i]);
                    if (!contains) {
                        System.out.println("Adding duplicate char");
                        arrayList.add(chars[i]);
                    }
                }
            }
        }
        return arrayList.toString();
    }

    public boolean contains(char[] arr,char target){
        System.out.println("Array : " + Arrays.toString(arr) + " ; target : " + target);
        // 1m * a, a
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Found! Returning true");
                return true;
            }
        }
        System.out.println("Not found! Returning false");
        return false;
    }

    public boolean contains(ArrayList<Character> arrayList,char target){
        System.out.println("Array : " + arrayList + " ; target : " + target);
        // 1m * a, a
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) == target){
                System.out.println("Found! Returning true");
                return true;
            }
        }
        System.out.println("Not found! Returning false");
        return false;
    }

}
