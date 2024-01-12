package com.chawadi.family.members.Collections.LamdaExpression;

public class EsculatorDTO {



    private String place;

    private int StepWidth;

    private Double hight;

    private String movingDirection;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getStepWidth() {
        return StepWidth;
    }

    public void setStepWidth(int stepWidth) {
        StepWidth = stepWidth;
    }

    public Double getHight() {
        return hight;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }

    public String getMovingDirection() {
        return movingDirection;
    }

    public void setMovingDirection(String movingDirection) {
        this.movingDirection = movingDirection;
    }

    @Override
    public String toString() {
        return "EsculatorDTO{" +
                "place='" + place + '\'' +
                ", StepWidth=" + StepWidth +
                ", hight=" + hight +
                ", movingDirection='" + movingDirection + '\'' +
                '}';
    }

    public EsculatorDTO(String place, int stepWidth, Double hight, String movingDirection) {
        this.place = place;
        StepWidth = stepWidth;
        this.hight = hight;
        this.movingDirection = movingDirection;
    }
}
