package com.course.inner.anonymous;

import com.course.inner.example.Iterator;
import com.course.polymorphism.domain.Shape;

public class Test implements Iterator {

    @Override
    public boolean end() {
        return false;
    }

    @Override
    public Object current() {
        return null;
    }

    @Override
    public void next() {

    }
}
