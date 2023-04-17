package com.course.concurrency.raceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account();

        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 1000;i++){
            executorService.execute(new DepositTask(account,1));
        }

        TimeUnit.SECONDS.sleep(5);
        executorService.shutdown();
        int balance = account.getBalance();
        System.out.println(balance);


    }

}
