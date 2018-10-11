package _08.wrappper;

public class Example {
    public static void main(String[] args) {
        int number=10;
        testMethod(number);

    }

    public static void testMethod(long i){
        System.out.println("long");

        //burada Integer yerine long tercih edilir

        // int --> long widening
        // int -> Integer boxing yerine tercih edilir.
    }
    public static void testMethod(Integer i){
        System.out.println("Integer");

    }
}
