package _04.collectionAPI;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SortedSet1 {
    public static void main(String[] args) {
        SortedSet<Integer> setNumbers = new TreeSet<>();

        setNumbers.addAll(Arrays.asList(5,12,34,67,87,56,38,24,91,60,3));

        System.out.println("Original Set: " + setNumbers);

        Integer first = setNumbers.first();

        System.out.println("First element: " + first);

        Integer last = setNumbers.last();

        System.out.println("Last element: " + last);




        SortedSet<Integer> subSet = setNumbers.subSet(11, 54);

        System.out.println("Sub Set: " + subSet);

        SortedSet<Integer> headSet = setNumbers.headSet(67);

        System.out.println("Head Set: " + headSet);

        SortedSet<Integer> tailSet = setNumbers.tailSet(48);

        System.out.println("Tail Set: " + tailSet);

        Comparator comparator = setNumbers.comparator();

        System.out.println("Sorted by natural ordering? " + (comparator == null));



    }
}
