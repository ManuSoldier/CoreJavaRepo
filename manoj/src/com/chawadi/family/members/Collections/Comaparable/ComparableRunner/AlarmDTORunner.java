package com.chawadi.family.members.Collections.Comaparable.ComparableRunner;

import com.chawadi.family.members.Collections.Comaparable.AlarmDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlarmDTORunner {

    public static void main(String[] args) {


        AlarmDTO alarmDTO=new AlarmDTO("Morning", "8:00", 1,1.00, 'm');
        AlarmDTO alarmDTO1=new AlarmDTO("Evening", "8:30", 12,1.00, 'l');
        AlarmDTO alarmDTO2=new AlarmDTO("Morning", "8:40", 8,1.00, 's');
        AlarmDTO alarmDTO3=new AlarmDTO("Morning", "8:10", 4,1.00, 'l');
        AlarmDTO alarmDTO4=new AlarmDTO("Evening", "8:50", 2,1.00, 'l');
        AlarmDTO alarmDTO5=new AlarmDTO("Evening", "8:05", 3,1.00, 'm');



        List<AlarmDTO> list=new ArrayList<>();
        list.add(alarmDTO);
        list.add(alarmDTO1);
        list.add(alarmDTO2);
        list.add(alarmDTO3);
        list.add(alarmDTO4);
        list.add(alarmDTO5);

        System.out.println("Comparable using in the AlarmDTO");
        Collections.sort(list);
        System.out.println(list);

    }
}
