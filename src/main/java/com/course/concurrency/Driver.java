package com.course.concurrency;

import com.course.concurrency.domain.MyFunctionalInterface;
import com.course.concurrency.domain.MyThread;
import com.course.concurrency.domain.TaskA;
import com.course.concurrency.domain.TaskB;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args)  {
        System.out.println("Main thread started");
        testRunnable();
        testRunnable2();
        System.out.println("Main thread finished");

    }

    private static void testRunnable2(){
        /*Thread taskAIsDone = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task A is done");
            }
        });*/
        int seconds = 10;
        Thread taskAIsDone1 = new Thread(() -> System.out.println("Task A is done for " + seconds));
        // lambda expressions
        taskAIsDone1.start();
    }
    private static void testRunnable(){
        TaskA taskA = new TaskA();
        Thread thread = new Thread(taskA);
        thread.start();
    }
    private static void test1(){
        MyThread myThread = new MyThread();
        //myThread.run();
        myThread.start();
        System.out.println("Main finished");
    }

    private static void test0(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = searchAlgorithm(s);
        System.out.println(result);
        System.out.println("Finished");
    }
    private static String searchAlgorithm(String s) {
        // do something special for search
        return s + " kelimesinin sonuçları.....";
    }

}
