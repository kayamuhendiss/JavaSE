package _04.collectionAPI;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<String>(5);


        arrlist.add("G");
        arrlist.add("E");
        arrlist.add("F");
        arrlist.add("M");

        System.out.println("Size of list: " + arrlist.size());

        for (String s:arrlist){
            System.out.println(s);
        }

        int data=arrlist.indexOf("C");
        System.out.println(data);
    }
}
