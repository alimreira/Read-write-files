package com.company.java;

import java.io.FileInputStream;

public class FileInStream {
    public static void main(String[] args) {
        byte[] arr = new byte[120];
        try {

            FileInputStream five = new FileInputStream("src/com/company/java/FileIn.txt");
            System.out.println("Path added to file input");
//            //Read the first byte
//            int filein = five.read();
//            for(int i =0; i< filein.length(); i++){
//                if(i==charAt[0]){
//                    System.out.println(i);
//                }
//            }
            System.out.println(five.available());
            System.out.println(five.read(arr));
            System.out.println("Read?");

            String getter = new String(arr);
            System.out.println(getter);




            five.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
