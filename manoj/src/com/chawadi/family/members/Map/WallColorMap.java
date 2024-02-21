package com.chawadi.family.members.Map;

import java.util.*;

public class WallColorMap {

    public static void main(String[] args) {

        Map<String, String> wallColorMap=new HashMap<>();
        wallColorMap.put("StoneWall","Brown");
        wallColorMap.put("WoodenWall","green");
        wallColorMap.put("CementWall","pink");
        wallColorMap.put("MudWall","blue");
        wallColorMap.put("SheetWall","red");

        System.out.println("printing the values of WallColorMap");
        Set<String> keys=wallColorMap.keySet();
        keys.forEach(System.out::println);
        System.out.println("**************************************************");

        System.out.println("printing the values of WallColorMap");
        Collection<String> values=wallColorMap.values();
        values.forEach(System.out::println);
        System.out.println("**************************************************");



    }
}
