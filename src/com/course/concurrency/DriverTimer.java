package com.course.concurrency;

import com.course.concurrency.domain.TimerTask;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DriverTimer {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

    }

    private static void timerTest(){
        System.out.println("Enter time in seconds : ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        TimerTask timerTask = new TimerTask(seconds);
        Thread thread = new Thread(timerTask);
        thread.start();
        System.out.println("Main thread continue");
        System.out.println(".......");
    }

    private static void test0(){
        System.out.println("Enter time in seconds : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Alarm!!!!!!!!");


    }


}
