package com.company.java;
import java.io.ByteArrayInputStream;

public class ByteArr2 {
    public static void main(String[] args) {
        //Create array of bytes
        byte[] arr = {1, 2, 3, 4, 5};

        try {
            ByteArrayInputStream one = new ByteArrayInputStream(arr);
            System.out.println(one.available());

            for(int i = 0; i< arr.length; i++){

                   int data =  one.read();
                System.out.println(data);
            }
            one.close();
        }catch (Exception e){
            System.out.println(e.getMessage());


        }

    }
}




