package com.course.exceptions.ex;

import java.io.*;

public class DriverFinally {

    public static void main(String[] args) {

    }


    public int readFile() {
        File file = new File("error.log");

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int read = fileReader.read();
            return 1;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return 0;


    }

    public void test(){

        try {
            System.out.println("Hello world");
        } finally {
            System.out.println("Finally");
        }
    }

    public static void tryWithResources(){
        File file = new File("error.log");
        try (FileReader fileReader = new FileReader(file)) {
            fileReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
