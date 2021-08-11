package edu.pucmm.eict.util;

import java.util.Calendar;
import java.util.TimerTask;

public class ReminderSchedule extends TimerTask{

    private boolean sunday;
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;


    public ReminderSchedule(Boolean monday, Boolean tuesday,Boolean wednesday,Boolean thursday,Boolean friday, Boolean saturday,Boolean sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    @Override
    public void run() {
        Calendar currentDay = Calendar.getInstance();

        switch (currentDay.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                if(this.sunday){
                    System.out.println("Despierta!!!");
                }
                else
                {
                    System.out.println("Zzz...");
                }
                break;

            case 2:
                if(this.monday){
                    System.out.println("Despierta!!!");
                }
                else
                {
                    System.out.println("Zzz...");
                }
                break;

            case 3:
                if(this.tuesday){
                    System.out.println("Despierta!!!");
                }
                else
                {
                    System.out.println("Zzz...");
                }
                break;

            case 4:
                if(this.wednesday){
                    System.out.println("Despierta!!!");
                }
                else
                {
                    System.out.println("Zzz...");
                }
                break;

            case 5:
                if(this.thursday){
                    System.out.println("Despierta!!!");
                }
                else
                {
                    System.out.println("Zzz...");
                }
                break;

            case 6:
                if(this.friday){
                    System.out.println("Despierta!!!");
                }
                else
                {
                    System.out.println("Zzz...");
                }
                break;

            case 7:
                if(this.saturday){
                    System.out.println("Despierta!!!");
                }
                else
                {
                    System.out.println("Zzz...");
                }
                break;
        }
    }

}
