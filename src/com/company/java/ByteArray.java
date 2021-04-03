package com.company.java;

import java.io.ByteArrayInputStream;

public class ByteArray {
    public static void main(String[] args) {
        byte[] arr = {1,2,3,4};

        try{
            ByteArrayInputStream one = new ByteArrayInputStream(arr);
           for(int i = 0; i < arr.length; i++){
             int data = one.read();
               System.out.print(data + ", ");

           }
            one.close();
        }catch (Exception e){
            e.getMessage();
        }
    }
}




