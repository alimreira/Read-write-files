package com.company.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InStreamTwo {

    public static void main(String[] args) throws FileNotFoundException {
        byte[] array = new byte[100];
        try {
            InputStream four = new FileInputStream("src/com/company/java/poem.txt");

            System.out.println(four.available());

            four.read(array);
            System.out.println("Input read");

            String data = new String(array);
            System.out.println(data);

            four.close();

        } catch (Exception e) {
            e.getStackTrace();

        }
    }
}
