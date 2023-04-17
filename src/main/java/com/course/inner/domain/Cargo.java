package com.course.inner.domain;

public class Cargo {

    private String owner;

    public Cargo(String owner){
        this.owner = owner;
        System.out.println("Cargo constructor");
    }

    public class Destination {
        private String to;
        public Destination(String to){
            this.to = to;
            System.out.println("Destination constructor");
        }

        public String getTo() {
            Cargo cargo = Cargo.this;
            return to;
        }
    }

    public void ship(String to){
        Destination destination = new Destination(to);
        System.out.println("Cargo shipping to " + destination.to);
    }

    public Destination getDestination(String to) {
        return new Destination(to);
    }

    public static void test(){
        // Destination destination = new Destination("to"); error
    }




}
