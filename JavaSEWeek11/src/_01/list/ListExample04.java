package _01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample04 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        //coding to interface
        //sol taraf list-> Interface
        //sag tarafta ArrayList->Class

        list1 = new LinkedList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        //list2 = new LinkedList<>(); //compiler error!
    }
}
