package _04.sorting;

import java.util.Arrays;

public class SortingTest01 {
    public static void main(String[] args) {
        Integer[] numbers = {20, 50, -60, 70, 120};
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        Arrays.sort(numbers);
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }

    }
}