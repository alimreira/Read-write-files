package com.company.java;

import java.io.ByteArrayInputStream;

public class ReByteArray {

    public static void main(String[] args) {
        //Create a byteArray
        byte[] arr3 = {10, 20, 30, 40, 50};
        try {
            ByteArrayInputStream five = new ByteArrayInputStream(arr3);

            for (int i = 0; i < arr3.length; i++) {
                // int data = five.read();
                System.out.println(five.read());


            }
            five.close();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}

