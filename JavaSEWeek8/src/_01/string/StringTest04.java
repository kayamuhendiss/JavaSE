package _01.string;

public class StringTest04 {
    public static void main(String[] args) {
        String str1 = new String("string");
        //burada  2 tane obje olusur
        // 1) String poolda
        // 2) Non-pool heap
        // degisken her zaman non-pool u gosterir

        String str2 = new String("string");
        //burada 1 tane obje olusur. (String poolda obje olusmaz)
        //cunku hali hazirda "java" objesi String poolda mevcuT! bu nedenle string poolda olusmaz , non-poolda olusur.
        // new keyword oldugu icin her zaman yeni obje olusur.
        //DIkkat : string poolda zaten mevcut "java" objesi olustu!
        // non poolda olusur.

        System.out.println(str1 == str2);
    }
}
