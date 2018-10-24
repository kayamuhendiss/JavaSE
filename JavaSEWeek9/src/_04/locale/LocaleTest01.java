package _04.locale;

import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        int i=1;
        for (Locale l:locales){
            System.out.println(i+" : "+l);
            i++;
        }

        Locale locale=new Locale("tr","Tr");
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getDisplayLanguage());

    }
}
