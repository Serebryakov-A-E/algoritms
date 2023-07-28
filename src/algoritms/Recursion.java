package algoritms;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {

    }
    public static void countdown(int i) {
        System.out.println(i);
        if (i > 0) {
            countdown(i - 1);
        }
    }

    public static int factorial(int i) {
        if (i < 0) {
            return -1;
        }
        if (i > 1) {
            return i * factorial(i - 1);
        } else {
            return 1;
        }
    }

    public static int sum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static int recursionBinarySearch(int elem, int[] arr) {
        int middle = arr.length / 2;
        if (arr[middle] == elem) {
            return middle;
        } else if (arr[middle] > elem) {
            return recursionBinarySearch(elem, Arrays.copyOfRange(arr, 0, middle));
        } else {
            return middle + 1 + recursionBinarySearch(elem, Arrays.copyOfRange(arr, middle + 1, arr.length));
        }
    }
}
