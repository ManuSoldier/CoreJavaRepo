package com.chawadi.family.members.Collections.ComplexDataType;



import java.io.Serializable;



public class SensorDto implements Serializable {
   private String name;
   private String Type;
   private double cost;
   private int Distance;

   public void setName(String name) {
      this.name = name;
   }

   public SensorDto(String name, String type, double cost, int distance) {
      this.name = name;
      Type = type;
      this.cost = cost;
      Distance = distance;
   }

   @Override
   public String toString() {
      return "SensorDto{" +
              "name='" + name + '\'' +
              ", Type='" + Type + '\'' +
              ", cost=" + cost +
              ", Distance=" + Distance +
              '}';
   }

   public void setType(String type) {
      Type = type;
   }

   public void setCost(double cost) {
      this.cost = cost;
   }

   public void setDistance(int distance) {
      Distance = distance;
   }

   public String getName() {
      return name;
   }

   public String getType() {
      return Type;
   }

   public double getCost() {
      return cost;
   }

   public int getDistance() {
      return Distance;
   }
}
