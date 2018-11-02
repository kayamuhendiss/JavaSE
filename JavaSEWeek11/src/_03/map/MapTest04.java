package _03.map;

import java.util.TreeMap;

public class MapTest04 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "key1");
        treeMap.put(10, "key2");
        treeMap.put(20, "key3");
        treeMap.put(50, "key4");
        //

        System.out.println(treeMap.ceilingEntry(20)); //
        System.out.println(treeMap.ceilingKey(20)); //
        System.out.println(treeMap.higherEntry(20));

        System.out.println(treeMap.headMap(10));

    }
}
