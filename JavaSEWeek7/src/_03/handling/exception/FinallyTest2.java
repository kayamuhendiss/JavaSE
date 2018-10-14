package _03.handling.exception;

public class FinallyTest2 {
    public static void main(String[] args) {
        System.out.println(getValue());

    }
    private static int getValue() {
        int value = 5;

        try {
            value = 20 / 0;
            return value;
        } catch (Exception e) {
            value = 10;
            System.out.println("catch");
            return value; // exception yakalanacaktir return olmasina ragmen
            // finally calisacaktir.
        } finally {
            value = 50;
            System.out.println("finally");
            return value; // finally blogu calistigi icin en son olarak 50
            // degerini dondurecektir.
        }

    }

}
