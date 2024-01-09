package com.exception;

public class MutliCatchFinaly {
    public static void main(String[] args) {

        try {
            String Shop=null;
            throw new NullPointerException("abcd");

        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("successfully done");
        }
    }
}
