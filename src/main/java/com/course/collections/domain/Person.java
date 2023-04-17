package com.course.collections.domain;

import java.util.Objects;

public class Person /*implements Comparable<Person>*/{

    private String name;
    private String id;

    private String city;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person other = (Person)obj;
            return this.name.equals(other.name) && this.id.equals(other.id);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,this.id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    /*
    @Override
    public int compareTo(Person o) {
        int i = this.id.compareTo(o.id);
        return i;
    }
    */
}
