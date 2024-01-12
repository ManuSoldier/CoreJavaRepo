package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.TeliscopeDTO;
import com.chawadi.family.members.Collections.LamdaExpression.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeliscopeDTORunner {



    public static void main(String[] args) {

        TeliscopeDTO teliscopeDTO= new TeliscopeDTO("udupi", 300, 3, "good");
        TeliscopeDTO teliscopeDTO1= new TeliscopeDTO("davangere", 500, 5, "bad");
        TeliscopeDTO teliscopeDTO2= new TeliscopeDTO("harihara", 100, 1, "bad");
        TeliscopeDTO teliscopeDTO3= new TeliscopeDTO("malebennur", 100, 1, "good");

        List<TeliscopeDTO> list = new ArrayList<>();
        list.add(teliscopeDTO);
        list.add(teliscopeDTO1);
        list.add(teliscopeDTO2);
        list.add(teliscopeDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getPlace().compareTo(o2.getPlace())));
        System.out.println("after sorting Place in Ascending Order");
        for (TeliscopeDTO teliscope : list)
        {
            System.out.println(teliscope);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
        System.out.println("after sorting Place( in Descending Order");
        for (TeliscopeDTO teliscope1 : list) {
            System.out.println(teliscope1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getDistance(), o2.getDistance())));
        System.out.println("after sorting Price in Ascending Order");
        for (TeliscopeDTO teliscope2 : list)
        {
            System.out.println(teliscope2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getDistance(), o1.getDistance())));
        System.out.println("after sorting Price in Descending Order");
        for (TeliscopeDTO teliscope3 : list) {
            System.out.println(teliscope3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getCost(), o2.getCost())));
        System.out.println("after sorting tickets in Ascending Order");
        for (TeliscopeDTO teliscope4 : list) {
            System.out.println(teliscope4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getCost(), o1.getCost())));
        System.out.println("after sorting  in Descending Order");
        for (TeliscopeDTO teliscope5 : list) {
            System.out.println(teliscope5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getPerformence().compareTo(o2.getPerformence())));
        System.out.println("after sorting place in Ascending Order");
        for (TeliscopeDTO teliscope6 : list) {
            System.out.println(teliscope6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getPerformence().compareTo(o1.getPerformence())));
        System.out.println("after sorting place in Descending Order");
        for (TeliscopeDTO teliscope7 : list) {
            System.out.println(teliscope7);

        }


    }
}

