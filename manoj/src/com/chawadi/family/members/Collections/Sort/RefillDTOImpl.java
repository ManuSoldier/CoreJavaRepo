package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.RefillDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.Comparator;

 class RefillDTOCompanyAsc implements Comparator<RefillDTO>{

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getCompany(), o2.getCompany());
    }

}

class RefillDTOCompanyDsce implements Comparator<RefillDTO> {

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getCompany(), o1.getCompany());
    }

}



class RefillDTOCostAsc implements Comparator<RefillDTO>
{

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}


class RefillDTOCostDesc implements Comparator<RefillDTO>
{

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}




class RefillDTOQunatityAsc implements Comparator<RefillDTO>
{

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class RefillDTOQunatityDesc implements Comparator<RefillDTO>
{

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}




class RefillDTOQualityAesc implements Comparator<RefillDTO> {


    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getQuality(), o2.getQuality());
    }

}

class RefillDTOQualityDsce implements Comparator<RefillDTO> {

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getQuality(), o1.getQuality());
    }


}

