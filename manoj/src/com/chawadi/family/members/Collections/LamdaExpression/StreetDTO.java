package com.chawadi.family.members.Collections.LamdaExpression;

public class StreetDTO {


    private String name;

    private int distance;

    private double busCharge;

    private String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getBusCharge() {
        return busCharge;
    }

    public void setBusCharge(double busCharge) {
        this.busCharge = busCharge;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "StreetDTO{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", busCharge=" + busCharge +
                ", place='" + place + '\'' +
                '}';
    }

    public StreetDTO(String name, int distance, double busCharge, String place) {
        this.name = name;
        this.distance = distance;
        this.busCharge = busCharge;
        this.place = place;
    }
}
