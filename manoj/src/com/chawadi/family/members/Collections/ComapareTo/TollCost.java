package com.chawadi.family.members.Collections.ComapareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollCost {

    public static void main(String[] args) {

        Comparator<Double> comparator=new TollCostImpl();
        List<Double> list=new ArrayList<>();
        list.add(22.00);
        list.add(99.00);
        list.add(123.00);
        list.add(89.00);
        list.add(77.00);
        list.add(11.00);
        list.add(66.00);
        list.add(55.00);
        list.add(44.00);
        list.add(39.00);
        Collections.sort(list);
        for (Double i:list)
        {
            System.out.println(i);
        }
        System.out.println("Descending Order");
        Collections.sort(list,comparator);
        for (Double i:list)
        {
            System.out.println(i);
        }
    }
}
