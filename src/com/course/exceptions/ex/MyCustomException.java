package com.course.exceptions.ex;

public class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Custom trace");
    }
}
