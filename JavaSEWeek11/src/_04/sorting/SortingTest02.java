package _04.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest02 {
    public static void main(String[] args) {
        String []strings={"zuleyha","kaya","trabzon","ben","BUYUKHARF"};
        for (String s:strings){
            System.out.println(s);
        }
        System.out.println();
        //buyuk harflarin unicode degerleri daha kucuk o yuzden one geciyorlar
        Arrays.sort(strings);
        for (String s:strings){
            System.out.println(s+" ");
        }

        System.out.println();

        List<Integer> list=new ArrayList<>();

        list.add(20);
        list.add(60);
        list.add(50);
        list.add(1);
        list.add(-10);
        Collections.sort(list);

        for (Integer i:list){
            System.out.print(i+" ");
        }


    }
}
