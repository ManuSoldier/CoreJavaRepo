package com.chawadi.family.members.Collections.LamdaExpression;

public class ShipDTO {

    private String name;

    private int size;

    private double cost;

    private String portName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    @Override
    public String toString() {
        return "ShipDTO{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                ", portName='" + portName + '\'' +
                '}';
    }

    public ShipDTO(String name, int size, double cost, String portName) {
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.portName = portName;
    }
}
