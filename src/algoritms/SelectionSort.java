package algoritms;

import java.util.Arrays;

/**
 * Алгоритм сортировки выбором. Работает за О(n^2).
 */
public class SelectionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            int smallest = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (smallest > arr[j]) {
                    smallestIndex = j;
                    smallest = arr[j];
                }
            }
            arr[smallestIndex] = arr[i];
            arr[i] = smallest;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 22, 3, 12, 31, 1331, 31, 1, 0};

        System.out.println(Arrays.toString(sort(arr)));
    }
}
