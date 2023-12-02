package sorting_algorithms.selection_sort;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int iMin = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                // Compare elements
                if (arr[j] < arr[iMin]) {
                    iMin = j;
                }
            }

            if (iMin != i) {
                // Swap arr[i] and arr[iMin]
                int temp = arr[i];
                arr[i] = arr[iMin];
                arr[iMin] = temp;
            }
        }
    }
}
