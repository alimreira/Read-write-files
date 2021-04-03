package com.company.java;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReInputTwo {

    public static void main(String[] args) {
        byte[] arr1 = new byte[100];
        try {
            InputStream three = new FileInputStream("src/com/company/java/ReInTxt");

            System.out.println(three.available());

            three.read(arr1);

            String combs = new String(arr1);
            System.out.println(combs);

            three.close();




        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
