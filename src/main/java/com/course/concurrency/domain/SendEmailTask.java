package com.course.concurrency.domain;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class SendEmailTask implements Runnable {

    private String to;

    public SendEmailTask(String to) {
        this.to = to;
    }

    @Override
    public void run() {

        System.out.println("Sending email to : " + to + "; thread : + "+ Thread.currentThread().getName() +" time : " + LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Emailt sent to :" + to + " time : " + LocalDateTime.now());
    }
}
