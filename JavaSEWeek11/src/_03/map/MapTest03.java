package _03.map;

import java.util.LinkedHashMap;
import java.util.Map;


public class MapTest03 {
    public static void main(String[] args) {


        Map<Integer,String> myMap = new LinkedHashMap<>();
        myMap.put(100,"value1");
        myMap.put(2,"value2");
        myMap.put(4,"value2");
        myMap.put(3,"value2");
        myMap.put(5,"value2");
        myMap.put(8,"value2");


        System.out.println(myMap);
    }
}
