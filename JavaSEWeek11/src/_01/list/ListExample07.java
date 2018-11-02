package _01.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample07 {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();

        nameList.add("Zuleyha");
        nameList.add("Kaya");
        nameList.add("Trabzon");
        nameList.add("Macka");

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        System.out.println("1////");

        for (String e : nameList) {
            System.out.println(e);
        }

        System.out.println("2////");

        Iterator<String> stringIterator=nameList.iterator();
        while (stringIterator.hasNext()){
           String e= stringIterator.next();
            System.out.println(e);
        }

        System.out.println("3////");

        ListIterator<String> listIterator=nameList.listIterator();
        while (listIterator.hasNext()){
            String e=listIterator.next();
            System.out.println(e);
        }

        System.out.println("4////");

        while (listIterator.hasPrevious()){
            String e=listIterator.previous();
            System.out.println(e);
        }


        System.out.println("5////");
    }
}
