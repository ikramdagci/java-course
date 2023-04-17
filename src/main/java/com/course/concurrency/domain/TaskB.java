package com.course.concurrency.domain;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskB implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        TimeUnit.SECONDS.sleep(5);
        throw new Exception();
    }
}
