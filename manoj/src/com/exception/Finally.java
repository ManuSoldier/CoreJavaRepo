package com.exception;

public class Finally {
    public static void main(String[] args) {

        int Name[]={1,2,3,4};
        try{
            System.out.println(Name[5]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("the exception occures");
            System.err.println(e);
        }
        finally {
            System.out.println("the finally block excecuted sucessfully");
        }
    }
}
