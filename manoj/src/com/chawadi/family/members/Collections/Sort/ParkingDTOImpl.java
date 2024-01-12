package com.chawadi.family.members.Collections.Sort;

import com.chawadi.family.members.Collections.Sort.declare.CoverDTO;
import com.chawadi.family.members.Collections.Sort.declare.ParkingDTO;

import java.util.Comparator;



    class ParkingDTOCompanyAsc implements Comparator<ParkingDTO> {


        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getPlace(), o2.getPlace());
        }

    }

    class ParkingDTOCompanyDsce implements Comparator<ParkingDTO> {

        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getPlace(), o1.getPlace());
        }

    }



    class ParkingDTOCostAsc implements Comparator<ParkingDTO>
    {

        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return Double.compare(o1.getCost(), o2.getCost());
        }
    }


    class ParkingDTOCostDesc implements Comparator<ParkingDTO>
    {

        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return Double.compare(o2.getCost(), o1.getCost());
        }
    }




    class ParkingDTOQunatityAsc implements Comparator<ParkingDTO>
    {

        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return Integer.compare(o1.getSapce(), o2.getSapce());
        }
    }
    class ParkingDTOQunatityDesc implements Comparator<ParkingDTO>
    {

        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return Integer.compare(o2.getSapce(), o1.getSapce());
        }
    }




    class ParkingDTOQualityAesc implements Comparator<ParkingDTO> {


        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getLocation(), o2.getLocation());
        }

    }

    class ParkingDTOQualityDsce implements Comparator<ParkingDTO> {

        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getLocation(), o1.getLocation());
        }


    }

