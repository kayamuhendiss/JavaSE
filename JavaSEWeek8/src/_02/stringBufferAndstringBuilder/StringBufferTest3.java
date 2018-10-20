package _02.stringBufferAndstringBuilder;

public class StringBufferTest3 {
    public static void main(String[] args) {
        String str1=new String("Java");
        String str2=new String("Java");
        System.out.println(str1.equals(str2));


        StringBuilder sb1=new StringBuilder("Deneme");
        StringBuilder sb2=new StringBuilder("Deneme");
        System.out.println(sb1.equals(sb2));

        //StringBuilder ve StringBuffer icin equals metodu override edilmemistir!
        // bu siniflar icin equals == ile ayni sekilde calisir.

    }
}
