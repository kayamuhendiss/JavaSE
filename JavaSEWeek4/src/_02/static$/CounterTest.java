package _02.static$;

public class CounterTest {
    public static void main(String[] args) {
        System.out.println(Counter.number);
        Counter.number=20; //static degiskenler sinifismi. seklinde cagirabiliriz
        System.out.println(Counter.number);
    }
}
