package com.chawadi.family.members.Collections.LamdaExpression;

public class SkyWalkDTO {

    private String place;

    private double price;

    private int tickets;

    private String saftey;

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public void setSaftey(String saftey) {
        this.saftey = saftey;
    }

    public String getPlace() {
        return place;
    }

    public double getPrice() {
        return price;
    }

    public int getTickets() {
        return tickets;
    }

    public String getSaftey() {
        return saftey;
    }

    @Override
    public String toString() {
        return "SkyWalkDTO{" +
                "place='" + place + '\'' +
                ", price=" + price +
                ", tickets=" + tickets +
                ", saftey='" + saftey + '\'' +
                '}';
    }

    public SkyWalkDTO(String place, double price, int tickets, String saftey) {
        this.place = place;
        this.price = price;
        this.tickets = tickets;
        this.saftey = saftey;
    }
}
