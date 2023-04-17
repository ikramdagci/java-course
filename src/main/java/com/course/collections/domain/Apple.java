package com.course.collections.domain;

public class Apple {

    private static int counter;
    private final int id = ++counter;

    public int getId() {
        return id;
    }



}
