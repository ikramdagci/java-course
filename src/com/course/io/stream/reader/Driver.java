package com.course.io.stream.reader;

import java.io.*;

public class Driver {

    /**
     * InputStreamReader
     * FileReader
     * StringReader
     * BufferedReader
     * FilterReader
     */
    public static void main(String[] args) throws FileNotFoundException {
        testFileReader();

    }

    public static void testFileReader(){
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("./people")));
        //InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);


        try (FileReader fileReader = new FileReader("./people")) {
            int read;
            while ((read = fileReader.read()) != -1) {
                System.out.print((char)read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
