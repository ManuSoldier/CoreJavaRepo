package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.CoverDTO;
import com.chawadi.family.members.Collections.Sort.declare.WaterPurifierDTO;

import java.util.Comparator;


    class WaterPurifierDTOCompanyAsc implements Comparator<WaterPurifierDTO> {


        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getCompany(), o2.getCompany());
        }

    }

    class WaterPurifierDTOCompanyDsce implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getCompany(), o1.getCompany());
        }

    }



    class WaterPurifierDTOCostAsc implements Comparator<WaterPurifierDTO>
    {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Double.compare(o1.getCost(), o2.getCost());
        }
    }


    class WaterPurifierDTOCostDesc implements Comparator<WaterPurifierDTO>
    {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Double.compare(o2.getCost(), o1.getCost());
        }
    }




    class CWaterPurifierDTOQunatityAsc implements Comparator<WaterPurifierDTO>
    {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Integer.compare(o1.getQuantity(), o2.getQuantity());
        }
    }
    class WaterPurifierDTOQunatityDesc implements Comparator<WaterPurifierDTO>
    {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Integer.compare(o2.getQuantity(), o1.getQuantity());
        }
    }




    class WaterPurifierDTOQualityAesc implements Comparator<WaterPurifierDTO> {


        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getQuality(), o2.getQuality());
        }

    }

    class WaterPurifierDTOQualityDsce implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getQuality(), o1.getQuality());
        }


    }

