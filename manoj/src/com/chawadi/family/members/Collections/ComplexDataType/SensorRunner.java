package com.chawadi.family.members.Collections.ComplexDataType;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SensorRunner {
    public static void main(String[] args) {

        Comparator<SensorDto> comparator=new SensorComparatorSortImp();

        SensorDto sensorDto=new SensorDto("UltraSonic","Temprature",23,2);
        SensorDto sensorDto1=new SensorDto("PIR","Infrared",28,1);
        SensorDto sensorDto2=new SensorDto("Tilt","vibration",45,6);
        SensorDto sensorDto3=new SensorDto("Ultrasonic","Temprature",23,2);

        List<SensorDto> list=new ArrayList<>();
        list.add(sensorDto);
        list.add(sensorDto1);
        list.add(sensorDto2);
        list.add(sensorDto3);
        Collections.sort(list,comparator);

        for (SensorDto dto:list)
        {
            System.out.println(dto);
        }

    }
}
