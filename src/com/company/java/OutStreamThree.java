package com.company.java;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutStreamThree {
    public static void main(String[] args) {
        String bio = "This includes name, age, address among others";
        try {
            OutputStream three = new FileOutputStream("src/com/company/java/Send.txt");

            byte[] array = bio.getBytes();

            three.write(array);
            System.out.println("Well written");

            three.close();

        } catch (Exception e) {
            e.getStackTrace();

        }
    }
}
