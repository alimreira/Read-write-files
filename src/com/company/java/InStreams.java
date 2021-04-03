package com.company.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InStreams {
    public static void main(String[] args) {

        byte[] array = new byte[100];
        try {
            System.out.println("Just checking if it got here");
            InputStream one = new FileInputStream("src/com/company/java/java.txt");
            System.out.println("AVAILABLE BYTES IN THE FILE");
            System.out.println(one.available());
           //Read file into the program with the input Stream
            System.out.println(one.read(array));
            System.out.println("Data read from the file");

            //Convert byte array into string
            String data = new String(array);
            System.out.println(data);
            //Close the input Stream
            one.close();
        }
        catch (Exception e) {
            System.out.println("There is an error");
            System.out.println(e.getStackTrace());
        }

    }
}
