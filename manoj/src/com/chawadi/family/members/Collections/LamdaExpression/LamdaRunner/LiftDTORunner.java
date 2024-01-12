package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.LiftDTO;
import com.chawadi.family.members.Collections.LamdaExpression.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiftDTORunner {


    public static void main(String[] args) {

        LiftDTO liftDTO = new LiftDTO("Briogade", 20, 2, "Banglore");
        LiftDTO liftDTO1 = new LiftDTO("Millanium", 30, 3, "chennai");
        LiftDTO liftDTO2= new LiftDTO("Ralyol Arcade", 50, 5, "kalkoltha");
        LiftDTO liftDTO3= new LiftDTO("orion Mall", 10, 1, "hydrabad");

        List<LiftDTO> list = new ArrayList<>();
        list.add(liftDTO);
        list.add(liftDTO1);
        list.add(liftDTO2);
        list.add(liftDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getApatmentName().compareTo(o2.getApatmentName())));
        System.out.println("after sorting Place in Ascending Order");
        for (LiftDTO lift : list)
        {
            System.out.println(lift);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getApatmentName().compareTo(o1.getApatmentName())));
        System.out.println("after sorting Place( in Descending Order");
        for (LiftDTO lift1 : list) {
            System.out.println(lift1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getWeight(), o2.getWeight())));
        System.out.println("after sorting Price in Ascending Order");
        for (LiftDTO lift2 : list)
        {
            System.out.println(lift2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getWeight(), o1.getWeight())));
        System.out.println("after sorting Price in Descending Order");
        for (LiftDTO lift3 : list) {
            System.out.println(lift3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getQuatity(), o2.getQuatity())));
        System.out.println("after sorting tickets in Ascending Order");
        for (LiftDTO lift4 : list) {
            System.out.println(lift4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getQuatity(), o1.getQuatity())));
        System.out.println("after sorting tickets in Descending Order");
        for (LiftDTO lift5 : list) {
            System.out.println(lift5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getLocation().compareTo(o2.getLocation())));
        System.out.println("after sorting Saftey in Ascending Order");
        for (LiftDTO lift6 : list) {
            System.out.println(lift6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getLocation().compareTo(o1.getLocation())));
        System.out.println("after sorting Saftey in Descending Order");
        for (LiftDTO lift7 : list) {
            System.out.println(lift7);

        }


    }
}

