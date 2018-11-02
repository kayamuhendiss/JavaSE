package _03.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1, null);
        hashMap.put(2, null);
        hashMap.put(null, null);

        System.out.println(hashMap);

        Map<Integer,String> hastable=new Hashtable<>();
        hastable.put(1, null);  //java.lang.NullPointerException
        hastable.put(2, null);  //java.lang.NullPointerException
        hastable.put(null, null);  //java.lang.NullPointerException
        System.out.println(hastable);

        // Hashtable da key ya da value null olamaz.
        // metotlari sychronized
        // unordered ozellik gosterir.

    }
}
