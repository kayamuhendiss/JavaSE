package _07.initialize.variable;

public class Araryinitialize {
    public static void main(String[] args) {
        int [] number = new int [5];
        // array in elemanlari -> int tipinde , ozaman otomatik olarak array in elemanlarina 0 atanir!
        //
        for ( int i :  number ){
            System.out.println(i);
        }

        System.out.println();

        double [] doubleArray = new double[3];
        for ( double i :  doubleArray ){
            System.out.println(i);
        }
    }
}
