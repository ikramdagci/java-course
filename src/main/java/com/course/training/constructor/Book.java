package com.course.training.constructor;

public class Book {


    int id;
    int pageNumber;
    String author;

    static int counter = 1;


    {
        System.out.println("Non-static block!");
    }

    static {
        System.out.println("Static block!");
    }

    public static void test(){
        System.out.println("Static method!");
    }

    public Book(int pageNumber,String author) {
        System.out.println("Constructor!");
        this.pageNumber = pageNumber;
        this.author = author;
        this.id = counter++;
    }

    public int getId(){
        System.out.println("Getter!");
        return this.id;
    }

    public void printInfo(){
        System.out.println("Book : [ id : " + this.id + ", pageNumber : " + this.pageNumber + ", author : " + this.author + " ]");
    }

}
