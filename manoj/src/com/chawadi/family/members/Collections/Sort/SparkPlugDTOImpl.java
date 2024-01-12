package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.SparkPlugDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.io.Serializable;
import java.util.Comparator;

class SparkPlugDTOShopNameAsce implements Comparator<SparkPlugDTO> {

    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getShopName(), o2.getShopName());
    }

}

class SparkPlugDTOCompanyDsce implements Comparator<SparkPlugDTO> {

    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getShopName(), o1.getShopName());
    }

}



class SparkPlugDTOCostAsc implements Comparator<SparkPlugDTO>
{

    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}


class SparkPlugDTOCostDesc implements Comparator<SparkPlugDTO>
{

    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}




class SparkPlugDTOQunatityAsc implements Comparator<SparkPlugDTO>
{

    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getQuntity(), o2.getQuntity());
    }
}
class SparkPlugDTOQunatityDesc implements Comparator<SparkPlugDTO>
{

    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Integer.compare(o2.getQuntity(), o1.getQuntity());
    }
}




class SparkPlugDTOQualityAesc implements Comparator<SparkPlugDTO> {


    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getQuality(), o2.getQuality());
    }

}

class SparkPlugDTOQualityDsce implements Comparator<SparkPlugDTO> {

    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getQuality(), o1.getQuality());
    }


}

