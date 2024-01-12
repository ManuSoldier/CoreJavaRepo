package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.ShipDTO;
import com.chawadi.family.members.Collections.LamdaExpression.ThermoMetreDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipDTORunner {



    public static void main(String[] args) {

        ShipDTO shipDTO = new ShipDTO("bigDady", 200, 2, "manglore");
        ShipDTO shipDTO1 = new ShipDTO("seas", 300, 3, "DVG");
        ShipDTO shipDTO2 = new ShipDTO("avenger", 500, 5, "karvar");
        ShipDTO shipDTO3= new ShipDTO("seas Hotel", 100, 1, "goa");

        List<ShipDTO> list = new ArrayList<>();
        list.add(shipDTO);
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getName().compareTo(o2.getName())));
        System.out.println("after sorting Place in Ascending Order");
        for (ShipDTO ship : list)
        {
            System.out.println(ship);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getName().compareTo(o1.getName())));
        System.out.println("after sorting Place( in Descending Order");
        for (ShipDTO ship1 : list) {
            System.out.println(ship1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getSize(), o2.getSize())));
        System.out.println("after sorting Price in Ascending Order");
        for (ShipDTO ship2 : list)
        {
            System.out.println(ship2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getSize(), o1.getSize())));
        System.out.println("after sorting Price in Descending Order");
        for (ShipDTO ship3 : list) {
            System.out.println(ship3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getCost(), o2.getCost())));
        System.out.println("after sorting tickets in Ascending Order");
        for (ShipDTO shipDTO4 : list) {
            System.out.println(shipDTO4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getCost(), o1.getCost())));
        System.out.println("after sorting  in Descending Order");
        for (ShipDTO shipDTO5 : list) {
            System.out.println(shipDTO5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getPortName().compareTo(o2.getPortName())));
        System.out.println("after sorting place in Ascending Order");
        for (ShipDTO shipDTO6 : list) {
            System.out.println(shipDTO6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getPortName().compareTo(o1.getPortName())));
        System.out.println("after sorting place in Descending Order");
        for (ShipDTO shipDTO7 : list) {
            System.out.println(shipDTO7);

        }


    }
}


