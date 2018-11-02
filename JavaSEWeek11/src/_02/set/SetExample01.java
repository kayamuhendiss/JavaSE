package _02.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample01 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        //
        System.out.println(set); //DUPLICATE elemana izin vermez!

        //[400, 100, 500, 200, 300]
        // HashSet -> unordered bir yapiya sahiptir!


    }// public interface Set<E> extends Collection<E> {
}
