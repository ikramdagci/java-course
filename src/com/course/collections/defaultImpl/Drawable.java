package com.course.collections.defaultImpl;

public interface Drawable {

    void draw();

    default void remove(){
        System.out.println("Remove");
    }

}
