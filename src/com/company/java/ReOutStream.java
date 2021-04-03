package com.company.java;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ReOutStream {

    public static void main(String[] args) {
        String time = "The byte stream, is also used by the outputStream," +
                "to write single byte of data, from a program" +
                "into a destination.";
        try{
        OutputStream four = new FileOutputStream("src/com/company/java/ReOutStreamTxt");

        byte[] arr2 = time.getBytes();

            four.write(arr2);
            System.out.println("File is written");
            four.close();






    }catch(Exception e) {
            System.out.println(e.getStackTrace());

        }
        }
}
