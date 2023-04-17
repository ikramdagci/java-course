package com.course.concurrency.domain;

import java.util.Scanner;

public class MyThread extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Arama kelimesi gir : ");
        String s = scanner.nextLine();
        String result = searchAlgorithm(s);
        System.out.println(result);
        System.out.println("Task finished");
    }

    private String searchAlgorithm(String s) {
        // do something special for search
        return s + " kelimesinin sonuçları.....";
    }
}
