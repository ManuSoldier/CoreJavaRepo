package com.chawadi.family.members.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LandOwnerMap {

    public static void main(String[] args) {
        Map<String,String> landOwnerMap=new HashMap<>();
        landOwnerMap.put("Commercial", "Madhu");
        landOwnerMap.put("rural", "anil");
        landOwnerMap.put("agiculthure", "Manoj");
        landOwnerMap.put("urban", "kiran");
        landOwnerMap.put("gov", "Stategov");

        System.out.println("printing the keys of landOwnerMap");
        Set<String> keys=landOwnerMap.keySet();
        keys.forEach(System.out::println);
        System.out.println("**************************************************");


        System.out.println("printing the values of landOwnerMap");
        Collection<String> values=landOwnerMap.values();
        values.forEach(System.out::println);
    }
}
