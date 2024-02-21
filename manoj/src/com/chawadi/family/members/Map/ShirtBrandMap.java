package com.chawadi.family.members.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShirtBrandMap {

    public static void main(String[] args) {

        Map<String, String> shirtBrandMap=new HashMap<>();
        shirtBrandMap.put("cotton", "Zara");
        shirtBrandMap.put("Silk", "Levis");
        shirtBrandMap.put("woolen", "Gucci");
        shirtBrandMap.put("Lenin", "Armani");
        shirtBrandMap.put("Nylon", "Nike");


        System.out.println("printing the values of ShirtBrandMap");
        Set<String> keys=shirtBrandMap.keySet();
        keys.forEach(System.out::println);
        System.out.println("**************************************************");

        System.out.println("printing the values of ShirtBrandMap");
        Collection<String> values=shirtBrandMap.values();
        values.forEach(System.out::println);

    }
}
