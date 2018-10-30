package _04.collectionAPI;

import java.util.Vector;

public class ContainAllTest {
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<Integer>(4);
        Vector<Integer> vectest = new Vector<Integer>(4);
        Vector<Integer> vecdiff = new Vector<Integer>(4);

        vec.add(4);
        vec.add(3);
        vec.add(2);


        vectest.add(4);
        vectest.add(3);
        vectest.add(2);


        vecdiff.add(4);
        vecdiff.add(3);
        vecdiff.add(12);

        System.out.println(vectest.containsAll(vecdiff));
        System.out.println(vectest.containsAll(vec));
    }
}
