package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.ShipDTO;
import com.chawadi.family.members.Collections.LamdaExpression.StreetDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreetDTORunner {


    public static void main(String[] args) {

        StreetDTO streetDTO = new StreetDTO("vivekananda Swami", 200, 2, "Manipal");
        StreetDTO streetDTO1 = new StreetDTO("Myco layout", 300, 3, "DVG");
        StreetDTO streetDTO2= new StreetDTO("Basaveshwara badavane", 500, 5, "malebennur");
        StreetDTO streetDTO3= new StreetDTO("shree Ram circle", 100, 1, "malebennur");

        List<StreetDTO> list = new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getName().compareTo(o2.getName())));
        System.out.println("after sorting Place in Ascending Order");
        for (StreetDTO street : list)
        {
            System.out.println(street);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getName().compareTo(o1.getName())));
        System.out.println("after sorting Place( in Descending Order");
        for (StreetDTO street1 : list) {
            System.out.println(street1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getDistance(), o2.getDistance())));
        System.out.println("after sorting Price in Ascending Order");
        for (StreetDTO street2 : list)
        {
            System.out.println(street2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getDistance(), o1.getDistance())));
        System.out.println("after sorting Price in Descending Order");
        for (StreetDTO street3 : list) {
            System.out.println(street3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getBusCharge(), o2.getBusCharge())));
        System.out.println("after sorting tickets in Ascending Order");
        for (StreetDTO street4 : list) {
            System.out.println(street4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getBusCharge(), o1.getBusCharge())));
        System.out.println("after sorting  in Descending Order");
        for (StreetDTO street5 : list) {
            System.out.println(street5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getPlace().compareTo(o2.getPlace())));
        System.out.println("after sorting place in Ascending Order");
        for (StreetDTO street6 : list) {
            System.out.println(street6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
        System.out.println("after sorting place in Descending Order");
        for (StreetDTO street7 : list) {
            System.out.println(street7);

        }


    }
}

