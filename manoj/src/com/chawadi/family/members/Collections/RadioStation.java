package com.chawadi.family.members.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class RadioStation {
    public static void main(String[] args) {

        Collection<String> radioStationCitiesname = new ArrayList<>();
        radioStationCitiesname.add("malebennur");
        radioStationCitiesname.add("davanger");
        radioStationCitiesname.add("harihar");
        radioStationCitiesname.add("honnali");

        Iterator<String> iterator = radioStationCitiesname.iterator();

        while (iterator.hasNext()) {
            String mk = iterator.next();
            if (mk.endsWith("i")) {
                System.out.println("radioStationCitiesname:" + mk);
            } else {
                System.out.println("no name ends with the i");
            }
        }
    }
}



