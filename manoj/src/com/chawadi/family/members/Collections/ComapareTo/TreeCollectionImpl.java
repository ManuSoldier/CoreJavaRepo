package com.chawadi.family.members.Collections.ComapareTo;

import java.util.Comparator;

public class TreeCollectionImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o2, Integer o1)
    {
        return  o1.compareTo(o2);
    }
}
