package com.course.exceptions;

import com.course.exceptions.ex.MyCustomRuntimeException;

/**
 * 1. checked
 * 2. unchecked
 */

public class DriverRuntimeExceptions {

    public static void main(String[] args) {
        h();
    }


    public static void h() {
        throw new MyCustomRuntimeException("Runtime");
    }

    public static void test1(){
        int x = 5;
        int y = 0;
        try {
            int a = x / y;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // case 2
        int[] arr = new int[3];
        int i = arr[3];
    }



}
