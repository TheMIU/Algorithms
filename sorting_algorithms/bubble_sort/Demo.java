package sorting_algorithms.bubble_sort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = { 10, 4, -5, 7, 10, 0, 11, 3 };

        System.out.print("Before sort : ");
        System.out.println(Arrays.toString(arr)); // [10, 4, -5, 7, 10, 0, 11, 3]

        BubbleSort.sort(arr);

        System.out.print("After sort  : ");
        System.out.println(Arrays.toString(arr)); // [-5, 0, 3, 4, 7, 10, 10, 11]
    }
}
