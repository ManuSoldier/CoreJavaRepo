package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.GeyserDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeyserDTORunner {


    public static void main(String[] args) {

        GeyserDTO geyserDTO= new GeyserDTO("udupi", 300, 3, "good");
        GeyserDTO geyserDTO1= new GeyserDTO("davangere", 500, 5, "bad");
        GeyserDTO geyserDTO2= new GeyserDTO("harihara", 100, 1, "bad");
        GeyserDTO geyserDTO3= new GeyserDTO("malebennur", 100, 1, "good");

        List<GeyserDTO> list = new ArrayList<>();
        list.add(geyserDTO);
        list.add(geyserDTO1);
        list.add(geyserDTO2);
        list.add(geyserDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getBrand().compareTo(o2.getBrand())));
        System.out.println("after sorting Place in Ascending Order");
        for (GeyserDTO geyser : list)
        {
            System.out.println(geyser);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getBrand().compareTo(o1.getBrand())));
        System.out.println("after sorting Place( in Descending Order");
        for (GeyserDTO geyser1 : list) {
            System.out.println(geyser1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getQuantity(), o2.getQuantity())));
        System.out.println("after sorting Price in Ascending Order");
        for (GeyserDTO geyser2 : list)
        {
            System.out.println(geyser2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getQuantity(), o1.getQuantity())));
        System.out.println("after sorting Price in Descending Order");
        for (GeyserDTO geyser3 : list) {
            System.out.println(geyser3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getCost(), o2.getCost())));
        System.out.println("after sorting tickets in Ascending Order");
        for (GeyserDTO geyser4 : list) {
            System.out.println(geyser4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getCost(), o1.getCost())));
        System.out.println("after sorting  in Descending Order");
        for (GeyserDTO geyser5 : list) {
            System.out.println(geyser5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getShopName().compareTo(o2.getShopName())));
        System.out.println("after sorting place in Ascending Order");
        for (GeyserDTO geyser6 : list) {
            System.out.println(geyser6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getShopName().compareTo(o1.getShopName())));
        System.out.println("after sorting place in Descending Order");
        for (GeyserDTO geyser7 : list) {
            System.out.println(geyser7);

        }


    }

}
