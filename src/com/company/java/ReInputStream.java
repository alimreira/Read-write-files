package com.company.java;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReInputStream {

    public static void main(String[] args) {
        byte[] arr = new byte[100];
        try {
            InputStream one = new FileInputStream("src/com/company/java/ReInSrc");
//Check the available bytes in the Source
            System.out.println(one.available());
            //Read the bytes to the program
            one.read(arr);
            //Convert the read byte array to String
            String two = new String(arr);
            System.out.println(two);

            //Close the Stream
            one.close();






        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
