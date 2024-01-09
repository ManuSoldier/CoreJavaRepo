package com.exception;

public class MultiCatch {

    public static void main(String[] args) {
        String Name="Manoj";

        try
        {
           throw new ArrayIndexOutOfBoundsException("handled the exception");
        }
        catch(ArrayIndexOutOfBoundsException | NullPointerException c)
        {
            System.out.println("the MultiCatch will handling");
        }
    }
}
