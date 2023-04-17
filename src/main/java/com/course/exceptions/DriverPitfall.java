package com.course.exceptions;

import com.course.exceptions.ex.JokeException;
import com.course.exceptions.ex.VeryImportantException;

public class DriverPitfall {

    public static void main(String[] args) {
        f();
    }
    public static void f() {
        try {
            try{
                g();
            } finally {
                h();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void g() throws VeryImportantException {
        throw new VeryImportantException();
    }

    public static void h() throws JokeException {
        throw new JokeException();
    }

}
