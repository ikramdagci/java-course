package com.course.concurrency.domain;

import java.util.concurrent.TimeUnit;

public class TimerTask implements Runnable{

    private int timeInSeconds;

    public TimerTask(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public void setTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    @Override
    public void run() {
        System.out.println("Set timer for " + timeInSeconds + " seconds.");
        try {
            TimeUnit.SECONDS.sleep(timeInSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Alarm!!!!!!!!");

    }
}
