package com.course.reusability.domain.people;

public class Person {

    String fullName;
    String tckn;
    String address;
    char gender;


    public Person(String fullName, String tckn, String address, char gender) {
        this.fullName = fullName;
        this.tckn = tckn;
        this.address = address;
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Full Name : "+fullName + ", Gender : " + gender + ", Address : " + address;
    }
}
