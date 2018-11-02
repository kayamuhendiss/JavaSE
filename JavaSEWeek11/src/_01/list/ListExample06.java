package _01.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample06 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();

        list1.add("Zuleyha");
        list1.add("Kaya");
        list1.add("Trabzon");
        list1.add("Macka");

        Object [] array1=list1.toArray();

        String [] array2=list1.toArray(new String[list1.size()]);

        list1.add("yeni element");

        System.out.println(list1);

        for (String s:array2){
            System.out.println(s);

        }
    }
}
