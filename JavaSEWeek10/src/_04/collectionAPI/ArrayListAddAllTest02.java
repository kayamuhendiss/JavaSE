package _04.collectionAPI;
import  java.util.*;

public class ArrayListAddAllTest02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(8);
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);

        System.out.println(arrlist);

        boolean b = Collections.addAll(arrlist, 40,30,50);

        System.out.println(arrlist);

        //arrlist.clear();
        System.out.println(arrlist);
        boolean retval = arrlist.contains(10);

        if (retval == true) {
            System.out.println("element 10 is contained in the list");
        } else {
            System.out.println("element 10 is not contained in the list");
        }
    }
}
