package com.chawadi.family.members.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarModelMap {

    public static void main(String[] args) {
        Map<String,Integer> carModelMap=new HashMap<>();
        carModelMap.put("kia", 2018);
        carModelMap.put("innova", 2000);
        carModelMap.put("nano", 2009);
        carModelMap.put("alto", 1990);
        carModelMap.put("Rolls Royce", 2002);

        System.out.println("printing the keys of carModelMap");
        Set<String> keys=carModelMap.keySet();
        keys.forEach(System.out::println);
        System.out.println("**************************************************");


        System.out.println("printing the values of carModelMap");
        Collection<Integer> values=carModelMap.values();
        values.forEach(System.out::println);
    }
}
