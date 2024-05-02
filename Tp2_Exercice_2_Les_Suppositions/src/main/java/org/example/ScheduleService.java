package org.example;

import java.util.TimeZone;

public class ScheduleService {
    public boolean doSchedule() {


        return TimeZone.getDefault().getID().equals("GMT+01:00");
    }

    public boolean backup() {

        return System.getProperty("os.name").startsWith("Windows");
    }
}
