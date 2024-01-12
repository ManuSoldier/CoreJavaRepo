package com.chawadi.family.members.Collections.LamdaExpression.LamdaRunner;

import com.chawadi.family.members.Collections.LamdaExpression.EsculatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EsculatorDTORunner {

    public static void main(String[] args) {

        EsculatorDTO esculatorDTO= new EsculatorDTO("BTM", 200, 20.00, "Upwords");
        EsculatorDTO esculatorDTO1= new EsculatorDTO("Rajajinagar", 300, 3.0, "DownWords");
        EsculatorDTO esculatorDTO2= new EsculatorDTO("Bhanashakari", 500, 5.22, "DownWords");
        EsculatorDTO esculatorDTO3= new EsculatorDTO("Megestic", 100, 66.00, "Upwords");

        List<EsculatorDTO> list = new ArrayList<>();
        list.add(esculatorDTO);
        list.add(esculatorDTO1);
        list.add(esculatorDTO2);
        list.add(esculatorDTO3);

        System.out.println("******************************************");
        Collections.sort(list,(o1, o2)->(o1.getPlace().compareTo(o2.getPlace())));
        System.out.println("after sorting Place in Ascending Order");
        for (EsculatorDTO esculator : list)
        {
            System.out.println(esculator);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
        System.out.println("after sorting Place( in Descending Order");
        for (EsculatorDTO esculator1 : list) {
            System.out.println(esculator1);
        }

        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getStepWidth(), o2.getStepWidth())));
        System.out.println("after sorting Price in Ascending Order");
        for (EsculatorDTO esculator2 : list)
        {
            System.out.println(esculator2);
        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getStepWidth(), o1.getStepWidth())));
        System.out.println("after sorting Price in Descending Order");
        for (EsculatorDTO esculator3 : list) {
            System.out.println(esculator3);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getHight(), o2.getHight())));
        System.out.println("after sorting tickets in Ascending Order");
        for (EsculatorDTO esculator4 : list) {
            System.out.println(esculator4);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getHight(), o1.getHight())));
        System.out.println("after sorting  in Descending Order");
        for (EsculatorDTO esculator5 : list) {
            System.out.println(esculator5);

        }


        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o1.getMovingDirection().compareTo(o2.getMovingDirection())));
        System.out.println("after sorting place in Ascending Order");
        for (EsculatorDTO esculator6 : list) {
            System.out.println(esculator6);

        }



        System.out.println("******************************************");
        Collections.sort(list,(o1,o2)->(o2.getMovingDirection().compareTo(o1.getMovingDirection())));
        System.out.println("after sorting place in Descending Order");
        for (EsculatorDTO esculator7 : list) {
            System.out.println(esculator7);

        }


    }
}

