package com.chawadi.family.members;

public class chawadikc {

    chawadikc()
    {
        System.out.println("starting the no-arg const in chavadikc");
    }

   public  chawadikc(int id,String name)
    {
        System.out.println("starting the cons in the chawadikc");
    }

    protected chawadikc(int id,String name,double contact)
    {
        System.out.println("Starting the 3rd const in the chawadikc");
    }

    private chawadikc(int id,String name,double contact,int members)
    {
        System.out.println("Starting the 3rd const in the chawadikc");
    }



    void kechaveerayya()
    {
        System.out.println("running the kenchaveerayya in the chawadikc");
    }

    public void suma()
    {
        System.out.println("running the suma in the chawadikc");
    }

    protected void manoj()
    {
        lekhan();
        System.out.println("running the manoj in the chawadikc");
    }

    private void lekhan()
    {
        System.out.println("running the lekhan in the chawadikc");
    }
}
