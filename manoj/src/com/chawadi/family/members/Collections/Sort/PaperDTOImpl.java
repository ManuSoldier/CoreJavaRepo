package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.PaperDTO;

import java.util.Comparator;

import java.lang.String;

class PaperDTOTypeAsce implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }

}


class PaperDTOTypeDsce implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }

}



class PaperDTOCostAsc implements Comparator<PaperDTO>
{

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}


class PaperDTOCostDesc implements Comparator<PaperDTO>
{

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}




class PaperDTOQunatityAsc implements Comparator<PaperDTO>
{

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class PaperDTOQunatityDesc implements Comparator<PaperDTO>
{

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}




class PaperDTOQualityAesc implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getQuality(), o2.getQuality());
    }

}



class PaperDTOQualityDsce implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getQuality(), o1.getQuality());
    }

}