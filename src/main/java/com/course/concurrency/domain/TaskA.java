package com.course.concurrency.domain;

public class TaskA implements Runnable{
    @Override
    public void run() {
//        System.out.println("Task A is done");
        System.out.println(25/0);
    }
}
