package com.chawadi.family.members.Collections.Sort.declare;

public class ParkingDTO {

    private String place;

    private int sapce;

    private double cost;

    private String location;

    public void setPlace(String place) {
        this.place = place;
    }

    public void setSapce(int sapce) {
        this.sapce = sapce;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getPlace() {
        return place;
    }

    public int getSapce() {
        return sapce;
    }

    public double getCost() {
        return cost;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "ParkingDTO{" +
                "place='" + place + '\'' +
                ", sapce=" + sapce +
                ", cost=" + cost +
                ", location='" + location + '\'' +
                '}';
    }

    public ParkingDTO(String place, int sapce, double cost, String location) {
        this.place = place;
        this.sapce = sapce;
        this.cost = cost;
        this.location = location;
    }
}
