package _02.calendar;

import java.util.Calendar;

public class CalendarTest {
    // Calendar

    // java.util.Calendar sinifi abstract bir siniftir.

    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        // Factory Design Pattern yaklasimi
        // GregorianCalendar objesi doner varsayilan olarak.

        System.out.println(cal);


        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)); // [0 - 11] ocak ->0 , aralik ->11
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // [1 - 7] , Sunday -> 1  Saturday -> 7

        System.out.println(cal.get(Calendar.HOUR)); //12 sistem
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24luk
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.MILLISECOND));
        //

        System.out.println(cal.get(Calendar.ZONE_OFFSET)/(1000*3600)); //+3 UTC

        System.out.println();

        cal.add(Calendar.MONTH, 2);
        //roll metodu tasirmaz! suan 18.12.2017 , add ile 2 ay ekledigimizde yil 2018 gecer
        //

        System.out.println(cal);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }


}
