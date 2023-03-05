package com.course.exceptions.domain;

import com.course.exceptions.ex.MyCustomException;

public class MyLibrary {

    public static int /*catch (Exception e) {
        } */f(int a,int b) throws MyCustomException{
        if(b == 0) {
            throw new MyCustomException("Something went wrong");
        } else {
            return a / b;
        }
    }

}
