package com.company.java;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutStream {
    public static void main(String[] args) {
        //1
        String type = "I owe it to God Almighty";
        try {
            //2
            OutputStream three = new FileOutputStream("src/com/company/java/output.txt");
            //3.
            byte[] result = type.getBytes();
            //4.Write to the output stream
            three.write(result);
            System.out.println("Data is written to file");
            //5.
            three.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

