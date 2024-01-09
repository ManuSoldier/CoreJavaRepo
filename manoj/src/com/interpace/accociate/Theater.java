package com.interpace.accociate;

public class Theater {

    TicketBooking ticketBooking;

    public Theater(TicketBooking ticketBooking)
    {
        this.ticketBooking=ticketBooking;
        System.out.println("the const running in the Theater");
    }

    public  double sell(int quantity)
    {
        double total=ticketBooking.buy(quantity);


        if (quantity>5)
        {
            System.out.println("the dicount is apllaid and the ticket is booked");
            double res=total*(0.1);
            double grandTotal=total-res;
            return grandTotal;
        }
        else
        {
            System.out.println("there is no discount better luck next Time but ticket is booked");
            return total;
        }
    }


    public void cancel(){
        System.out.println("the ticket has been canceled");
        this.ticketBooking.cancel();
    }
}
