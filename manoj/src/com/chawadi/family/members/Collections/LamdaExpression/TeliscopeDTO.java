package com.chawadi.family.members.Collections.LamdaExpression;

public class TeliscopeDTO {


    private String place;


    private int distance;


    private double cost;


    private String performence;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPerformence() {
        return performence;
    }

    public void setPerformence(String performence) {
        this.performence = performence;
    }

    @Override
    public String toString() {
        return "TeliscopeDTO{" +
                "place='" + place + '\'' +
                ", distance=" + distance +
                ", cost=" + cost +
                ", performence='" + performence + '\'' +
                '}';
    }

    public TeliscopeDTO(String place, int distance, double cost, String performence) {
        this.place = place;
        this.distance = distance;
        this.cost = cost;
        this.performence = performence;
    }
}
