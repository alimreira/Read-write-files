package com.company.java;

import java.io.FileOutputStream;

public class FileOut {
    public static void main(String[] args) {
        String out = "This will be written to an external destination";
        try {

            FileOutputStream one = new FileOutputStream("src/com/company/java/outter.txt");

            byte [] first = out.getBytes();
            one.write(first);
            System.out.println("File written");

            one.close();


        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
