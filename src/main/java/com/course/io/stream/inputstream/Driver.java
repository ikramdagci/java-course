package com.course.io.stream.inputstream;

import java.io.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
//        testBuffered();
//        testFilterInputStream();
        testScanner();

    }

    public static void testScannerInputStream() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(new File("./people"))))) {
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }

    }

    public static void testScanner(){
        try (Scanner scanner = new Scanner(new File("./people"))) {
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void testFilterInputStream(){
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("./people")));){
            int read;
            while((read = bufferedInputStream.read()) != -1) {
                System.out.print((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void testFileIS() {
        File file = new File("./people");
        try (FileInputStream fileInputStream =  new FileInputStream(file)) {
            int read;
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
                read = fileInputStream.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void testBuffered() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("./people")));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
