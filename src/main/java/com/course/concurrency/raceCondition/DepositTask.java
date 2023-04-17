package com.course.concurrency.raceCondition;

public class DepositTask implements Runnable {

    private Account account;
    private int amount;

    public DepositTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
