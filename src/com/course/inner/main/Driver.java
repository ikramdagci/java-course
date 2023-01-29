package com.course.inner.main;

import com.course.inner.domain.Cargo;



public class Driver {

    public static void main(String[] args) {
        Cargo cargo = new Cargo("John Doe");
        cargo.ship("Istanbul");

        Cargo.Destination dest = cargo.getDestination("Kocaeli");

        //Cargo.Destination destination = new Cargo.Destination("Kocaeli");
        //String owner = new String("test??");

    }

}
