package _05.assignment;

public class Notes {
    public static void main(String[] args) {
        int number = 10; // literal assigment

        byte b1 = 10; // 10 -> int tipinde
        // casting/narrow int -> byte a otomatik olarak yapilmaktadir.

        byte b2 = (byte)10;  //explicit

        //
        System.out.println(Byte.MAX_VALUE);
        // [-128, 127]
        byte number1 = 10;
        byte number2 = 5;
        byte sum = (byte) (number1 + number2); // veri kaybi riski vardir . otomatik olarak int -> byte donusum yapmaz!
        System.out.println(sum);

        //
    }
}
// asignment operator -> =
