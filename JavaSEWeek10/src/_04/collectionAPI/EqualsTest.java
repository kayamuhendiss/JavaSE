package _04.collectionAPI;
import java.util.Arrays;

public class EqualsTest {
    public static void main(String[] args) {
        boolean[] arr1 = new boolean[] { true, false, true };
        boolean[] arr2 = new boolean[] { false, true, true };
        boolean[] arr3 = new boolean[] { true, false, true };


        boolean retval = Arrays.equals(arr1, arr2);
        System.out.println("arr1 and arr2 equal: " + retval);


        boolean retval2 = Arrays.equals(arr1, arr3);
        System.out.println("arr1 and arr3 equal: " + retval2);


    }
}
