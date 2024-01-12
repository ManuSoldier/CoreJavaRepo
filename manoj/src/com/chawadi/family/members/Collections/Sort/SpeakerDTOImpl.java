package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.PaperDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.Comparator;

class SpeakerDTOCompanyAsc implements Comparator<SpeakerDTO>{


    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getCompany(), o2.getCompany());
    }

}

class SpeakerDTOCompanyDsce implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getCompany(), o1.getCompany());
    }

}



class SpeakerDTOCostAsc implements Comparator<SpeakerDTO>
{

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}


class SpeakerDTOCostDesc implements Comparator<SpeakerDTO>
{

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}




class SpeakerDTOQunatityAsc implements Comparator<SpeakerDTO>
{

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o1.getQuatity(), o2.getQuatity());
    }
}
class SpeakerDTOQunatityDesc implements Comparator<SpeakerDTO>
{

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o2.getQuatity(), o1.getQuatity());
    }
}




class SpeakerDTOQualityAesc implements Comparator<SpeakerDTO> {


    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getQuality(), o2.getQuality());
    }

}

class SpeakerDTOQualityDsce implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getQuality(), o1.getQuality());
    }


}
