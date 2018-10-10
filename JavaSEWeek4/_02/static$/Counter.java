package _02.static$;

public class Counter  {

    static int number=0;

    //static degiskenlerin bit tane kopyasi vardir.
    //class variable adi da verilir
    //bu degiskenler sinifa aittir

    Counter(){
        number++;
    }

    public static void main(String[] args) {


        new Counter();
        new Counter();
        new Counter();
        new Counter();
        System.out.println(number);

    }
}
