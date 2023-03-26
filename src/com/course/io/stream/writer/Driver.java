package com.course.io.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Driver {

    /**
     * StringWriter
     * PrintWriter
     * PipedWriter
     * BufferedWriter
     */
    public static void main(String[] args) {
        fileWriterTest();
    }


    public static void fileWriterTest(){
        try (FileWriter fileWriter = new FileWriter("addresses")) {
            fileWriter.write("Kocaeli,Darıca 41700");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
