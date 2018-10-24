package _05.numberFormat;

import javax.naming.NamingEnumeration;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        NumberFormat nf1=NumberFormat.getCurrencyInstance();
        double number=58756.3336;
        System.out.println(nf1.format(number));


        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(nf2.format(number));

        NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(nf3.format(number));

        NumberFormat nf4=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf4.format(number));
    }
}
