package _03.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> myMap=new HashMap<>();
        myMap.put(100,"value1");
        myMap.put(2,"value2");
        myMap.put(4,"value2");

        System.out.println(myMap.isEmpty());
        System.out.println(myMap.containsKey(1));
        System.out.println(myMap.size());
        System.out.println(myMap.get(1));

        System.out.println(myMap);
        myMap.clear();

        System.out.println(myMap);

    }
}
