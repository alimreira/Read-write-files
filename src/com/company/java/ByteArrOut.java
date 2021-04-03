package com.company.java;

import java.io.ByteArrayOutputStream;

public class ByteArrOut {
    public static void main(String[] args) {
    String hours = "Party hour";
        try{
            ByteArrayOutputStream two = new ByteArrayOutputStream ();

           two.write(hours.getBytes());


            System.out.println("Converts String to byte");



        }catch(Exception e){
            e.getStackTrace();
        }
    }
    }

