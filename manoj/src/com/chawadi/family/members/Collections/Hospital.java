package com.chawadi.family.members.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class Hospital {
    public static void main(String[] args) {

        Collection<String> HospitaalName=new ArrayList<>();
        HospitaalName.add("Apoorva");
        HospitaalName.add("Jaydeva");
        HospitaalName.add("Narayana");
        HospitaalName.add("Subbaia");
        HospitaalName.add("Bhapuji");
        HospitaalName.add("vasan eye care");
        HospitaalName.add("C G ");
        HospitaalName.add("Maxx");
        HospitaalName.add("sarji");
        HospitaalName.add("Suboday");
        HospitaalName.add("Shreya");
        HospitaalName.add("Unity");
        HospitaalName.add("City Central");
        HospitaalName.add("Sparsha");
        HospitaalName.add("Megghan");
        HospitaalName.add("S S");
        HospitaalName.add("Manipal");
        HospitaalName.add("N Pai");
        HospitaalName.add("Apoolo");

        Iterator<String> iterator=HospitaalName.iterator();
        while (iterator.hasNext()) {
            String hosp = iterator.next();
            if (hosp.endsWith("o")) {
                System.out.println("HospitaalName:" + hosp);
            }
            }
            }
    }

