package com.exception;

public class MultipleCatch {

    public static void main(String[] args) {

        int id = 0;

        try {
            throw new NullPointerException ("integer");
        }
        catch (NullPointerException e) {
            System.out.println("this is null point exception");
        }
        catch (ArrayIndexOutOfBoundsException A) {
            System.out.println("this arrayindexoutofboundexception");
        }
        catch (Exception b)
        {
            System.out.println("this is exception");
        }
    }
}
