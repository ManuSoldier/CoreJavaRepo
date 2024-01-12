package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.SkyWalkDTO;
import com.chawadi.family.members.Collections.LamdaExpression.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VentilatorDTORunner {

    public static void main(String[] args) {

        VentilatorDTO ventilatorDTO= new VentilatorDTO("manipal", 200, 2, "Manipal");
        VentilatorDTO ventilatorDTO1= new VentilatorDTO("bapuji", 300, 3, "DVG");
        VentilatorDTO ventilatorDTO2= new VentilatorDTO("CG hospital", 500, 5, "DVG");
        VentilatorDTO ventilatorDTO3= new VentilatorDTO("City Central", 100, 1, "DVG");

        List<VentilatorDTO> list = new ArrayList<>();
        list.add(ventilatorDTO);
        list.add(ventilatorDTO1);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getHospitalName().compareTo(o2.getHospitalName())));
        System.out.println("after sorting Place in Ascending Order");
        for (VentilatorDTO ventilator : list)
        {
            System.out.println(ventilator);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getHospitalName().compareTo(o1.getHospitalName())));
        System.out.println("after sorting Place( in Descending Order");
        for (VentilatorDTO ventilator : list) {
            System.out.println(ventilator);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getQuantity(), o2.getQuantity())));
        System.out.println("after sorting Price in Ascending Order");
        for (VentilatorDTO ventilator1 : list)
        {
            System.out.println(ventilator1);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getQuantity(), o1.getQuantity())));
        System.out.println("after sorting Price in Descending Order");
        for (VentilatorDTO ventilator2 : list) {
            System.out.println(ventilator2);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getCost(), o2.getCost())));
        System.out.println("after sorting tickets in Ascending Order");
        for (VentilatorDTO ventilator3 : list) {
            System.out.println(ventilator3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getCost(), o1.getCost())));
        System.out.println("after sorting  in Descending Order");
        for (VentilatorDTO ventilator4 : list) {
            System.out.println(ventilator4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getPlace().compareTo(o2.getPlace())));
        System.out.println("after sorting place in Ascending Order");
        for (VentilatorDTO ventilator5 : list) {
            System.out.println(ventilator5);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
        System.out.println("after sorting place in Descending Order");
        for (VentilatorDTO ventilator6 : list) {
            System.out.println(ventilator6);

        }


    }
}

