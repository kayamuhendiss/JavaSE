package _03.dateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date date=new Date();


        SimpleDateFormat sdf = new SimpleDateFormat();

        //// public class SimpleDateFormat extends DateFormat {

        sdf=new SimpleDateFormat("MM-dd-yy");
        System.out.println(sdf.format(date));

        sdf=new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss.SSS E  Z");
        System.out.println(sdf.format(date));


        System.out.println("parse");

        Date d1 = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String s = df.format(d1);
        System.out.println("formatted: "+ s);
        try {
            Date d2 = df.parse(s);
            System.out.println("parsed = " + d2.toString());
            //System.out.println(df.parse("10/15/14"));
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }
    }
}
