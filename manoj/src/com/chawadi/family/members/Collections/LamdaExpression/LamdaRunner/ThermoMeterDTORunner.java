package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.ThermoMetreDTO;
import com.chawadi.family.members.Collections.LamdaExpression.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThermoMeterDTORunner {


    public static void main(String[] args) {

        ThermoMetreDTO thermoMetreDTO = new ThermoMetreDTO("manipal", 200, 2, "Manipal");
        ThermoMetreDTO thermoMetreDTO1 = new ThermoMetreDTO("bapuji", 300, 3, "DVG");
        ThermoMetreDTO thermoMetreDTO2= new ThermoMetreDTO("CG hospital", 500, 5, "DVG");
        ThermoMetreDTO thermoMetreDTO3= new ThermoMetreDTO("City Central", 100, 1, "DVG");

        List<ThermoMetreDTO> list = new ArrayList<>();
        list.add(thermoMetreDTO);
        list.add(thermoMetreDTO1);
        list.add(thermoMetreDTO2);
        list.add(thermoMetreDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getUse().compareTo(o2.getUse())));
        System.out.println("after sorting Place in Ascending Order");
        for (ThermoMetreDTO termoMeter : list)
        {
            System.out.println(termoMeter);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getUse().compareTo(o1.getUse())));
        System.out.println("after sorting Place( in Descending Order");
        for (ThermoMetreDTO termoMeter1 : list) {
            System.out.println(termoMeter1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getQuantity(), o2.getQuantity())));
        System.out.println("after sorting Price in Ascending Order");
        for (ThermoMetreDTO termoMeter2 : list)
        {
            System.out.println(termoMeter2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getQuantity(), o1.getQuantity())));
        System.out.println("after sorting Price in Descending Order");
        for (ThermoMetreDTO termoMeter3 : list) {
            System.out.println(termoMeter3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getTemprature(), o2.getTemprature())));
        System.out.println("after sorting tickets in Ascending Order");
        for (ThermoMetreDTO termoMeter4 : list) {
            System.out.println(termoMeter4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getTemprature(), o1.getTemprature())));
        System.out.println("after sorting  in Descending Order");
        for (ThermoMetreDTO ventilator5 : list) {
            System.out.println(ventilator5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getDocterName().compareTo(o2.getDocterName())));
        System.out.println("after sorting place in Ascending Order");
        for (ThermoMetreDTO termoMeter6 : list) {
            System.out.println(termoMeter6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getDocterName().compareTo(o1.getDocterName())));
        System.out.println("after sorting place in Descending Order");
        for (ThermoMetreDTO termoMeter7 : list) {
            System.out.println(termoMeter7);

        }


    }
}

