package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.ComplexDataType.SensorDto;

import java.util.Comparator;

public class SensorComparatorSortImp implements Comparator<SensorDto> {
    @Override
    public int compare(SensorDto o1, SensorDto o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
