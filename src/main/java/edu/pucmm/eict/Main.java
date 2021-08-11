package edu.pucmm.eict;

import edu.pucmm.eict.util.ReminderSchedule;


import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        setReminderSchedule(18,0,0,true,true,false,true,true,false,false);

        while (true){
            int a=10000;

            a = a+1;
            a = a-1;
        }
    }


    static void setReminderSchedule(int hour, int minute, int second,Boolean monday, Boolean tuesday,Boolean wednesday,Boolean thursday,Boolean friday, Boolean saturday,Boolean sunday){
        Date hourReminder = new Date(System.currentTimeMillis());

        Calendar c = Calendar.getInstance();
        c.setTime(hourReminder);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        //If the current hour is after reminder hour we put the reminder to start the next day.
        if (c.get(Calendar.HOUR_OF_DAY) >= hour) {
            c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + 1);
        }

        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, second);

        hourReminder = c.getTime();
        System.out.println(hourReminder);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        // The code is executed every 24 hours (once a day)
        int timeRepetition = 86400000;

        // Schedule the timer.
        Timer timer = new Timer();
        timer.schedule(new ReminderSchedule(monday,tuesday,wednesday,thursday,friday,saturday,sunday), hourReminder, timeRepetition);

    }


}
