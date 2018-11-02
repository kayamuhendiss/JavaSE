package _01.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample02 {
    public static void main(String[] args) {
         List lists=new ArrayList();
         //non-jenerik
         //E->Object

        lists.add(100);
        lists.add("100");
        lists.add(true);

         String element= (String) lists.get(0);
        // java.lang.ClassCastException: java.lang.Integer cannot be cast to
        // java.lang.String

        List<String> arrayList=new ArrayList<>();
        arrayList.add("100");
        //arrayList.add(1001);  compiler Error
;    }
}
