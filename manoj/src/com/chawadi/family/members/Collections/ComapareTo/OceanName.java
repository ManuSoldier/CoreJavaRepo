package com.chawadi.family.members.Collections.ComapareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanName {
    public static void main(String[] args) {

        Comparator<String> comparator=new OceanNameImpl();
        List<String> list=new ArrayList<>();
        list.add("Pacific Ocean");
        list.add("Atlantic Ocean");
        list.add("Indian Ocean");
        list.add("Southern (or Antarctic) Ocean");
        list.add("Arctic Ocean");
        list.add("Mariana Mirage");
        list.add("Aquamarine Expanse");
        list.add("Sapphire Serenity");
        list.add("Elysian Tides");
        list.add("Mystic Meridian");
        Collections.sort(list);
        for (String i:list)
        {
            System.out.println(i);
        }
        System.out.println("descending order");
        Collections.sort(list,comparator);
        for (String i:list)
        {
            System.out.println(i);
        }


    }
}
