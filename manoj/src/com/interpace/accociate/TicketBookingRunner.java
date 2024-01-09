package com.interpace.accociate;

public class TicketBookingRunner {
    public static void main(String[] args) {

        System.out.println("Starting main in the TicketBookingRunner");
        TicketBooking ticketBooking=new TicketBookingImpl();

        Theater theater=new Theater(ticketBooking);
        double res=theater.sell(3);
        System.out.println(res);

    }
}
