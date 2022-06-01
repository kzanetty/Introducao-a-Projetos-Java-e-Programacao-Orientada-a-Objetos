package util;

import java.util.Calendar;
import java.util.Date;

public class Calculate {

    public static int age(Date date){
        long timeTotal, timeBirthday, milesecondsAlive;
        Calendar cal = Calendar.getInstance();

        cal.setTime(date);
        timeBirthday = cal.getTimeInMillis();
        cal.setTime(new Date());
        timeTotal = cal.getTimeInMillis();

        milesecondsAlive = timeTotal - timeBirthday;
        return (int) (milesecondsAlive/1000/60/60/24/30/12);
    }

    public static int monthsAlive(Date date){
        long timeTotal, timeBirthday, milesecondsAlive;
        Calendar cal = Calendar.getInstance();

        cal.setTime(date);
        timeBirthday = cal.getTimeInMillis();
        cal.setTime(new Date());
        timeTotal = cal.getTimeInMillis();

        milesecondsAlive = timeTotal - timeBirthday;
        return (int)(milesecondsAlive/1000/60/60/24/30);

    }

    public static int daysAlive(Date date){
        long timeTotal, timeBirthday, milesecondsAlive;

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        timeBirthday = cal.getTimeInMillis();

        cal.setTime(new Date());
        timeTotal = cal.getTimeInMillis();

        milesecondsAlive = timeTotal - timeBirthday;
        return (int)(milesecondsAlive/ 1000 / 60 / 60 / 24);
    }

    public static int hoursAlive(Date date){
        long timeTotal, timeBirthday, milesecondsAlive;
        Calendar cal = Calendar.getInstance();

        cal.setTime(date);
        timeBirthday = cal.getTimeInMillis();
        cal.setTime(new Date());
        timeTotal = cal.getTimeInMillis();

        milesecondsAlive = timeTotal - timeBirthday;
        return (int)(milesecondsAlive/1000/60/60);
    }

    public static int comparativeTimeAge(Date comparativeDate, Date dateBirthday){
        long timeToday, timeBirthday, milesecondsAlive, dateComparative, differenceTimeTodayAndComparative;
        Calendar cal = Calendar.getInstance();

        cal.setTime(dateBirthday);
        timeBirthday = cal.getTimeInMillis();
        cal.setTime(new Date());
        timeToday = cal.getTimeInMillis();
        milesecondsAlive = timeToday - timeBirthday;
        int age = (int) (milesecondsAlive/1000/60/60/24/30/12);

        cal.setTime(comparativeDate);
        dateComparative = cal.getTimeInMillis();

        differenceTimeTodayAndComparative = ((dateComparative - timeToday)/1000/60/60/24/30/12);

        if(differenceTimeTodayAndComparative >= 0){
            age += differenceTimeTodayAndComparative;
        } else{
            age += differenceTimeTodayAndComparative;
        }

        return age;
    }



}
