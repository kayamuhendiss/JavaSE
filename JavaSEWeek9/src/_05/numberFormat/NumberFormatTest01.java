package _05.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        // java.text.NumberFormat
        // public abstract class NumberFormat extends Format

        NumberFormat nf1=NumberFormat.getInstance();
        double number=6537.1387657;
        System.out.println(number);

        System.out.println(nf1.format(number));


        NumberFormat nf2=NumberFormat.getInstance(new Locale("tr","TR"));
        System.out.println(nf2.format(number));
    }
}
