package com.course.exceptions;

import com.course.exceptions.domain.MyLibrary;
import com.course.exceptions.ex.MyCustomException;
import com.course.exceptions.ex.ScreenRenderException;

public class DriverRethrow {

    public static int f(int a,int b) throws ScreenRenderException {
        try {
            return MyLibrary.f(a, b);
        } catch (MyCustomException e) {
            e.fillInStackTrace();
            throw new ScreenRenderException(e);
        }  /*catch (Exception e) {

        }*/

        //System.out.println("selam"); unreachable statement

    }


    public static void g() {
        try {
            f();
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }

    public static void f() throws MyCustomException {
        throw new MyCustomException("Something went wrong :(");
    }

}
