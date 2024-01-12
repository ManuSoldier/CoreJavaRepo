package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.CoverDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.Comparator;

class CoverDTOCompanyAsc implements Comparator<CoverDTO> {


        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
        }

    }

    class CoverDTOCompanyDsce implements Comparator<CoverDTO> {

        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
        }

    }



    class CoverDTOCostAsc implements Comparator<CoverDTO>
    {

        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return Double.compare(o1.getCost(), o2.getCost());
        }
    }


    class CoverDTOCostDesc implements Comparator<CoverDTO>
    {

        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return Double.compare(o2.getCost(), o1.getCost());
        }
    }




    class CoverDTOQunatityAsc implements Comparator<CoverDTO>
    {

        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return Integer.compare(o1.getQuantity(), o2.getQuantity());
        }
    }
    class CoverDTOQunatityDesc implements Comparator<CoverDTO>
    {

        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return Integer.compare(o2.getQuantity(), o1.getQuantity());
        }
    }




    class CoverDTOQualityAesc implements Comparator<CoverDTO> {


        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getLocatioin(), o2.getLocatioin());
        }

    }

    class CoverDTOQualityDsce implements Comparator<CoverDTO> {

        @Override
        public int compare(CoverDTO o1, CoverDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getLocatioin(), o1.getLocatioin());
        }


    }

