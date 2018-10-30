package _04.collectionAPI;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>(5);

        arrayList.add(15);
        arrayList.add(22);
        arrayList.add(30);
        arrayList.add(40);


        for (Integer e:arrayList){
            System.out.println(e);
        }
        System.out.println("/////////////");
        int algel=arrayList.get(3);
        System.out.println(algel);

        System.out.println("/////////////");
        arrayList.set(2,44);
        for (Integer e:arrayList){
            System.out.println(e);
        }

        System.out.println("/////////////");

        arrayList.remove(2);

        for (Integer e:arrayList){
            System.out.println(e);
        }
    }
}
