package com.chawadi.family.members.Map;

import java.util.*;

public class TvBrandMap {

    public static void main(String[] args) {

        Map<String,String> tvBrandMap=new HashMap<>();
        tvBrandMap.put("LCD", "LG");
        tvBrandMap.put("Doom", "usha");
        tvBrandMap.put("Black and White", "onida");
        tvBrandMap.put("Smart LCD", "realme");
        tvBrandMap.put("Modern Doom", "samsung");

        System.out.println("printing the keys of TvBrandMap");
        Set<String> keys=tvBrandMap.keySet();
        keys.forEach(System.out::println);
        System.out.println("**************************************************");


        System.out.println("printing the values of TvBrandMap");
        Collection<String> values=tvBrandMap.values();
        values.forEach(System.out::println);


    }
}
