package _02.operators;

public class BooleanEqualityTest {
    public static void main(String[] args) {
        boolean value=false;

        // if(value==true)  yapmak yerine
        // if(value=true) seklinde yapiyoruz BUG !

        // if(value)  SEKLINDE kontrol et!
        if(value=true){
            System.out.println("value is true");

        }
        else {
            System.out.println("value is false");
        }

        int number=200;

        // = yaptigimizada hata verir vunku sonucu if blogunda cikan sonuc true yada false degildir
        if (number==20){}
    }
}
