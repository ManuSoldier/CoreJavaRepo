package com.chawadi.family.members.Collections.Comaparable;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.*;
public class AlarmDTO implements Comparable<AlarmDTO>{


        private String session;

        private String time;

        private int repeatingAlarm;

        private Double duration;

        private char size;

        public void setSession(String session) {
            this.session = session;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setRepeatingAlarm(int repeatingAlarm) {
            this.repeatingAlarm = repeatingAlarm;
        }

        public void setDuration(Double duration) {
            this.duration = duration;
        }

        public void setSize(char size) {
            this.size = size;
        }

        public String getSession() {
            return session;
        }

        public String getTime() {
            return time;
        }

        public int getRepeatingAlarm() {
            return repeatingAlarm;
        }

        public Double getDuration() {
            return duration;
        }

        public char getSize() {
            return size;
        }


        @Override
        public String toString() {
            return "AlarmDTO{" +
                    "session='" + session + '\'' +
                    ", time='" + time + '\'' +
                    ", repeatingAlarm=" + repeatingAlarm +
                    ", duration=" + duration +
                    ", size=" + size +
                    '}';
        }


    public AlarmDTO(String session, String time, int repeatingAlarm, Double duration, char size) {
            this.session = session;
            this.time = time;
            this.repeatingAlarm = repeatingAlarm;
            this.duration = duration;
            this.size = size;
        }

    @Override
    public int compareTo(AlarmDTO alarm) {
        return 0;
    }
}



