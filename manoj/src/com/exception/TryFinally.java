package com.exception;

public class TryFinally {
    public static void main(String[] args) {
        String Location="Btm";

        try{
            throw new ArrayIndexOutOfBoundsException("this is the TryFinally block");
        }
        finally {
            System.out.println("this finally will excute always");
        }
    }
}
