package com.chawadi.family.members.Collections.ComapareTo;

import java.util.Comparator;

public class TollCostImpl implements Comparator<Double>{

    @Override
    public int compare(Double o1, Double o2) {
        return o2.compareTo(o1);
    }
}
