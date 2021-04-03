package com.company.java;

import java.io.ByteArrayOutputStream;

public class ReByteArrOut {

    public static void main(String[] args) {
        String data = "ByteArrayOutputStream";
        try {
            ByteArrayOutputStream ton = new ByteArrayOutputStream();

            byte[] two = data.getBytes();

            ton.write(two);

            String daily = ton.toString();
            System.out.println(daily);


            ton.close();


        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
