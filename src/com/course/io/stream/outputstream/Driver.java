package com.course.io.stream.outputstream;

import java.io.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
//        fileOutputStream();
        standartIO();
    }

    public static void standartIO(){
        try (PrintStream printStream = new PrintStream(System.out)) {
            printStream.println("Hello World!");
        }
    }

    public static void fileOutputStream(){
        File file = new File("./output2");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);) {
            String data = "Person{name='Ikram Dagci', id='4'}\n";
            byte[] bytes = data.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
