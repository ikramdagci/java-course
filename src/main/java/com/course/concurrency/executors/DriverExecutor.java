package com.course.concurrency.executors;

import com.course.concurrency.domain.SendEmailTask;
import com.course.concurrency.domain.TaskB;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class DriverExecutor {


    public static void main(String[] args) throws FileNotFoundException {
        //System.setOut(new PrintStream("email.out"));
        List<String> emailReceiverList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            emailReceiverList.add(i + "@hotmail.com");
        }
//        testSendEmail(emailReceiverList);
        //testSendEmailWithExecutors(emailReceiverList);
        testCallable();
    }

    private static void testCallable() {
        TaskB taskB = new TaskB();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> futureResult = executorService.submit(taskB);
        try {
            Integer integer = futureResult.get();
            System.out.println(integer);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static void testSendEmailWithExecutors(List<String> emailReceiverList) {
        System.out.println("Started : time : " + LocalDateTime.now());
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        /*ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        threadPoolExecutor.setCorePoolSize(1000);*/
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newCachedThreadPool();

        for (String receiver : emailReceiverList) {
            SendEmailTask sendEmailTask = new SendEmailTask(receiver);
//            executorService.execute(sendEmailTask);
            executorService2.execute(sendEmailTask);
        }
        executorService.shutdown();
        System.out.println("Sent! time : " + LocalDateTime.now());
    }

    private static void testSendEmail(List<String> emailReceiverList) {
        System.out.println("Started : time : " + LocalDateTime.now());
        for (String receiver : emailReceiverList) {
            SendEmailTask sendEmailTask = new SendEmailTask(receiver);
            Thread thread = new Thread(sendEmailTask);
            thread.start();
        }
        System.out.println("Stack trace : " + Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Sent! time : " + LocalDateTime.now());
    }

}
