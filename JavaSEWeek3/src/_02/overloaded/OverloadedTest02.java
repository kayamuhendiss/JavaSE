package _02.overloaded;

public class OverloadedTest02 {
    public static void main(String[] args) {
        OverloadedTest02 object = new  OverloadedTest02();

        // 10 -> int tipindedir.;
        short a=10;
        object.testMethod(a);
        short s = (short) 32768;
        object.testMethod(s);
        object.testMethod((short)1000);

        // 32767
        // 2147483647
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    public void testMethod(short s) {
        System.out.println(s);
    }
}
