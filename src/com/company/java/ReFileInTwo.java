package com.company.java;

import java.io.FileInputStream;

public class ReFileInTwo {
    public static void main(String[] args) {
        byte[] arr3 = new byte[100];
        try {
            FileInputStream two = new FileInputStream("src/com/company/java/ReFile");

            System.out.println(two.available());

            two.read(arr3);
            //Convert the Array into String
            String nine = new String(arr3);
            System.out.println(nine);

            two.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
