package _07.wrapper;

public class Example {
    public static void main(String[] args) {
        Integer number=100;
        Integer number1=100;

        System.out.println(number==number1 );

        //-Djava.lang.Integer.IntegerCache.high="1000"
        Integer number2=1000;
        Integer number3=1000;
        System.out.println(number2==number3);
    }
}
