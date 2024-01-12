package com.chawadi.family.members.Collections.LamdaExpression;

public class LiftDTO {

    private String ApatmentName;

    private int Quatity;

    private double weight;


    private String location;

    public void setApatmentName(String apatmentName) {
        ApatmentName = apatmentName;
    }

    public void setQuatity(int quatity) {
        Quatity = quatity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getApatmentName() {
        return ApatmentName;
    }

    public int getQuatity() {
        return Quatity;
    }

    public double getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "LiftDTO{" +
                "ApatmentName='" + ApatmentName + '\'' +
                ", Quatity=" + Quatity +
                ", weight=" + weight +
                ", location='" + location + '\'' +
                '}';
    }

    public LiftDTO(String apatmentName, int quatity, double weight, String location) {
        ApatmentName = apatmentName;
        Quatity = quatity;
        this.weight = weight;
        this.location = location;
    }
}
