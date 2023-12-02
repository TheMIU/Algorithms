package searching_algorithms.linear_search;

public class Demo {
    public static void main(String[] args) {
        // need a sorted array
        int[] arr = { 2, 3, 4, 10, 40 };
        int target = 10;
        int result = LinearSearch.linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
