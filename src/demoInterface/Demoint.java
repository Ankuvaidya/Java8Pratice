package demoInterface;

import java.util.Calendar;

public class Demoint {

	public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println("Day of week : " +
                           c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of year : " +
                            c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week in Month : " +
                            c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Week in Year : " +
                            c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Day of Week in Month : " +                    
                      c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hour : " + c.get(Calendar.HOUR));
        System.out.println("Minute : " + c.get(Calendar.MINUTE));
        System.out.println("Second : " + c.get(Calendar.SECOND));
        System.out.println("AM or PM : " + c.get(Calendar.AM_PM));
        System.out.println("Hour (24-hour clock) : " +
                           c.get(Calendar.HOUR_OF_DAY));
    }

}
