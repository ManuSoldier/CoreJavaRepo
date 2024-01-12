package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.CharcholDTO;
import com.chawadi.family.members.Collections.Sort.declare.SpeakerDTO;

import java.util.Comparator;

    class CharcholeDTOCompany implements Comparator<CharcholDTO> {

        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getCompany(), o2.getCompany());
        }

    }

    class CharcholDTOCompanyDsce implements Comparator<CharcholDTO> {

        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getCompany(), o1.getCompany());
        }

    }


    class CharcholDTOCostAsc implements Comparator<CharcholDTO> {

        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return Double.compare(o1.getCost(), o2.getCost());
        }
    }


    class CharcholDTOCostDesc implements Comparator<CharcholDTO> {

        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return Double.compare(o2.getCost(), o1.getCost());
        }
    }


    class CharcholDTOQunatityAsc implements Comparator<CharcholDTO> {

        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return Double.compare(o1.getQuantity(), o2.getQuantity());
        }
    }

    class CharcholDTOQunatityDesc implements Comparator<CharcholDTO> {

        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return Integer.compare(o2.getQuantity(), o1.getQuantity());
        }
    }


    class CharcholDTOQualityAesc implements Comparator<CharcholDTO> {


        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getQuality(), o2.getQuality());
        }

    }

    class CharcholDTOQualityDsce implements Comparator<CharcholDTO> {

        @Override
        public int compare(CharcholDTO o1, CharcholDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getQuality(), o1.getQuality());
        }
    }





