package com.company.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Instream2 {
    public static void main(String[] args) {
        //1.
        byte[] array = new byte[100];
        try {
            //2
            InputStream two = new FileInputStream("src/com/company/java/Afternoon.txt");

            //3.System.out.println(two.available());
            //Read file into the byte array
            //4
            two.read(array);
            System.out.println("Byte data read from file");

            //Convert byte array into String
            //5.
            String result = new String(array);
            System.out.println(result);

            //Close the input stream
            //6.
            two.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}





