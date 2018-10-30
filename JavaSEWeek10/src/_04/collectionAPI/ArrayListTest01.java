package _04.collectionAPI;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<Integer>(5);

        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(35);
        arrayList.add(35);
        arrayList.add(35);


        for (Integer n:arrayList){
            System.out.println(n);
        }


        Object[] ob = arrayList.toArray();

        for (Object value : ob) {
            System.out.println("Number = " + value);
        }

    }
}
