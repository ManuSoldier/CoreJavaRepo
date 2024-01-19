package com.chawadi.family.members.Collections.Comaparable;

public class WingsDTO implements Comparable<WingsDTO>{


    private String birdName;

    private int noOfWings;

    private String flyingSpeed;

    private String wingsStrength;

    private int wingsLength;

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public String getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(String flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getWingsStrength() {
        return wingsStrength;
    }

    public void setWingsStrength(String wingsStrength) {
        this.wingsStrength = wingsStrength;
    }

    public int getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(int wingsLength) {
        this.wingsLength = wingsLength;
    }

    @Override
    public String toString() {
        return "WingsDTO{" +
                "birdName='" + birdName + '\'' +
                ", noOfWings=" + noOfWings +
                ", flyingSpeed='" + flyingSpeed + '\'' +
                ", wingsStrength='" + wingsStrength + '\'' +
                ", wingsLength=" + wingsLength +
                '}';
    }


    public WingsDTO(String birdName, int noOfWings, String flyingSpeed, String wingsStrength, int wingsLength) {
        this.birdName = birdName;
        this.noOfWings = noOfWings;
        this.flyingSpeed = flyingSpeed;
        this.wingsStrength = wingsStrength;
        this.wingsLength = wingsLength;
    }


    @Override
    public int compareTo(WingsDTO o) {
        return 0;
    }
}
