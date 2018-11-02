package _01.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample05 {
    public static void main(String[] args) {
        String []strings={"ZULEYHA","KAYA","TRABZON"};
        System.out.println(strings);

        List<String> list1=Arrays.asList(strings);
        System.out.println(list1);
       // list1.add("java ogreniyorum"); //java.lang.UnsupportedOperationException
       // list1.remove(0);          //java.lang.UnsupportedOperationException

        list1.set(2,"Bize Her Yer Trabzon");

        System.out.println(strings[2]);

        System.out.println(list1);

        List<String> list2 =new ArrayList<>();

       for (String es:strings){
            System.out.println(es);
                        }
        for (String e: strings){
            list2.add(e);
        }

        System.out.println(list2);

        list2.add("yeni element");
        System.out.println(list2);

    }
}
