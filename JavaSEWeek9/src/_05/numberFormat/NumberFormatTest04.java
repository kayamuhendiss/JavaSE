package _05.numberFormat;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatTest04 {
    public static void main(String[] args) throws ParseException {
        NumberFormat nf1=NumberFormat.getInstance();
        Number number  = nf1.parse("345.568");
        System.out.println(number);

        // NumberFormat kullanarak  , parse metodu ile String -> Number
    }
}
