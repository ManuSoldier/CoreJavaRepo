package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.BeltDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.Comparator;

class BeltDTOTypeAsce implements Comparator<BeltDTO> {


    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }

}

class BeltDTOCompanyDsce implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }

}



class BeltDTOCostAsc implements Comparator<BeltDTO>
{

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}


class BeltDTOCostDesc implements Comparator<BeltDTO>
{

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}




class BeltDTOQunatityAsc implements Comparator<BeltDTO>
{

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class BeltDTOQunatityDesc implements Comparator<BeltDTO>
{

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}




class BeltDTOQualityAesc implements Comparator<BeltDTO> {


    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getQuality(), o2.getQuality());
    }

}

class BeltDTOQualityDsce implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getQuality(), o1.getQuality());
    }


}

