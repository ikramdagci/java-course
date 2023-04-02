package com.course.concurrency.raceCondition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private Lock lock = new ReentrantLock();

    private volatile Integer balance = 0;

    public int getBalance() {
        return balance;
    }

    public  void deposit(int amount){

        synchronized (balance){
            //System.out.println(balance);
            int newBalance = balance + amount;
            this.balance = newBalance;
        }
       /* try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

}
