package _02.operators;

public class Bitwise {

    public static void main(String[] args) {
        byte b1 = 6 & 8;
        //0110 ->6
        //1000 ->8
        //----
        //0000

        byte b2 = 7 | 9;
        // 0111 -> 7
        // 1001 -> 9
        //-----
        // 1111

        byte b3 = 5 ^ 4;
        // 0101
        // 0100
        //-----
        // 0001
        System.out.println(b1 + " " + b2 + " " + b3);
    }
}
