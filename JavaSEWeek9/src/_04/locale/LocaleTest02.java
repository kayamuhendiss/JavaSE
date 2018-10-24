package _04.locale;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        Locale localeIT=Locale.ITALY;
        Locale localTR=new Locale("tr","TR");

        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL,localeIT);
        DateFormat dt=DateFormat.getDateInstance(DateFormat.FULL,localTR);
        Date date=new Date();

        System.out.println(dateFormat.format(date));
        System.out.println(dt.format(date));


    }
}
