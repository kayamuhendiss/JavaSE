package _05.numberFormat;

import java.text.NumberFormat;

public class NumberFormatTest03 {
    public static void main(String[] args) {
        NumberFormat nf5=NumberFormat.getInstance();
        double number=5876.336789;
        nf5.setMaximumFractionDigits(5); //virgulden sonra hassasiyet degeri
        //defaults 3 tur
        System.out.println(nf5.format(number));

        nf5.setMinimumFractionDigits(2);

        System.out.println(nf5.format(10)); //10.00 , setMinimumFractionDigits 2 oldugu icin 0 kendisi koyar.
        System.out.println(nf5.format(10.12));
        System.out.println(nf5.format(10.3)); //10.30
    }
}
