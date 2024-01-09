package com.exception;

public class TryCatch {

    public static void main(String[] args) {
         String str=null;
         try{
             throw new NullPointerException("values");
         }
         catch(NullPointerException s)
        {
            System.out.println("String is empty");
        }
    }
}
