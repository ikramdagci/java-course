package com.course.generics.model;

public class Cargo<E> {

    private E carriedItem;

//    private E ele = new E();ERROR
//    public static E carriedItem2; ERROR
//    private E[] elements = new E[3];ERROR

    public E getCarriedItem() {
        return carriedItem;
    }

    public void setCarriedItem(E carriedItem) {
        this.carriedItem = carriedItem;
    }
}
