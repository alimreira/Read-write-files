package com.company.java;


import java.io.FileOutputStream;

public class ReFileOut {
    public static void main(String[] args) {
        String ten = "A byte stream is use by the java" +
                "input and output streams which are abstract" +
                "classes, to read and write single bytes of data" +
                "from a source(InputStream), to a destination(OutputStream) ";
        //"the fileInput and OutPut streams, are subclasses

        //Create an Instance of the FileInputStream
        try {
            FileOutputStream twelve = new FileOutputStream("src/com/company/java/ReFileOut.txt");

            byte[] arr4 = ten.getBytes();

            twelve.write(arr4);

            twelve.close();


        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
