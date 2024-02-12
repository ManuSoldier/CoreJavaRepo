package com.chawadi.family.members.Collections.LamdaExpression;

import java.io.Serializable;

public class PlayGroundDTO implements Serializable,Comparable<PlayGroundDTO> {

    private String name;
    private String place;
    private double areaInSqFeet;
    private int distanceInKm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getAreaInSqFeet() {
        return areaInSqFeet;
    }

    public void setAreaInSqFeet(double areaInSqFeet) {
        this.areaInSqFeet = areaInSqFeet;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public PlayGroundDTO(String name, String place, double areaInSqFeet, int distanceInKm) {
        this.name = name;
        this.place = place;
        this.areaInSqFeet = areaInSqFeet;
        this.distanceInKm = distanceInKm;
    }

    @Override
    public String toString() {
        return "PlayGroundDTO{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", areaInSqFeet=" + areaInSqFeet +
                ", distanceInKm=" + distanceInKm +
                '}';
    }

    @Override
    public int compareTo(PlayGroundDTO o) {
        return this.name.compareTo(o.getName());
    }
}
