package com.company.java;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrOut2 {

    public static void main(String[] args) throws IOException {
        String cars = " Our automobiles are sold at affordable prices ";

        ByteArrayOutputStream sales = new ByteArrayOutputStream();

        byte[] arr3 = cars.getBytes();

        sales.write(arr3);

        System.out.println(sales.toByteArray());

        sales.close();


    }
}
