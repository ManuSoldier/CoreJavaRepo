package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SkyWalkDTORunner {

    public static void main(String[] args) {

        SkyWalkDTO skyWalkDTO = new SkyWalkDTO("madikere", 200, 2, "Good");
        SkyWalkDTO skyWalkDTO1 = new SkyWalkDTO("kerala", 300, 3, "bad");
        SkyWalkDTO skyWalkDTO2 = new SkyWalkDTO("chikmanglur", 500, 5, "Good");
        SkyWalkDTO skyWalkDTO3 = new SkyWalkDTO("banglore", 100, 1, "Good");

        List<SkyWalkDTO> list = new ArrayList<>();
        list.add(skyWalkDTO);
        list.add(skyWalkDTO1);
        list.add(skyWalkDTO2);
        list.add(skyWalkDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getPlace().compareTo(o2.getPlace())));
        System.out.println("after sorting Place in Ascending Order");
        for (SkyWalkDTO skyWalk : list)
        {
            System.out.println(skyWalk);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
        System.out.println("after sorting Place( in Descending Order");
        for (SkyWalkDTO skyWalk : list) {
            System.out.println(skyWalk);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getPrice(), o2.getPrice())));
        System.out.println("after sorting Price in Ascending Order");
        for (SkyWalkDTO skyWalk1 : list)
        {
            System.out.println(skyWalk1);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getPrice(), o1.getPrice())));
        System.out.println("after sorting Price in Descending Order");
        for (SkyWalkDTO skyWalk2 : list) {
            System.out.println(skyWalk2);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getTickets(), o2.getTickets())));
        System.out.println("after sorting tickets in Ascending Order");
        for (SkyWalkDTO skyWalk3 : list) {
            System.out.println(skyWalk3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getTickets(), o1.getTickets())));
        System.out.println("after sorting tickets in Descending Order");
        for (SkyWalkDTO skyWalk4 : list) {
            System.out.println(skyWalk4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getSaftey().compareTo(o2.getSaftey())));
        System.out.println("after sorting Saftey in Ascending Order");
        for (SkyWalkDTO skyWalk5 : list) {
            System.out.println(skyWalk5);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getSaftey().compareTo(o1.getSaftey())));
        System.out.println("after sorting Saftey in Descending Order");
        for (SkyWalkDTO skyWalk6 : list) {
            System.out.println(skyWalk6);

        }


}
}
