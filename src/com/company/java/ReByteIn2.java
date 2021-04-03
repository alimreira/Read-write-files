package com.company.java;

import java.io.ByteArrayInputStream;

public class ReByteIn2 {
    public static void main(String[] args) {
        byte[] arr5 = {11, 22, 33, 44, 55};

        //create an instance of a byteArrayInputStream
        try {
            ByteArrayInputStream four = new ByteArrayInputStream(arr5);

            for (int i = 0; i < arr5.length; i++) {
                System.out.println(four.read());
            }
            four.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
