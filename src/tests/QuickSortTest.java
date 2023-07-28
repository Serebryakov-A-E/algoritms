package tests;

import algoritms.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {
    @Test
    public void testQuickSortWithIntegerArray() {
        Integer[] arr = {5, 2, 7, 3, 1, 8, 4, 6};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortWithStringArray() {
        String[] arr = {"apple", "orange", "banana", "grape", "kiwi", "pear", "watermelon"};
        String[] expected = {"apple", "banana", "grape", "kiwi", "orange", "pear", "watermelon"};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortWithDoubleArray() {
        Double[] arr = {3.14, 2.71, 1.618, 0.577, 2.302, 1.414, 0.866};
        Double[] expected = {0.577, 0.866, 1.414, 1.618, 2.302, 2.71, 3.14};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        Integer[] arr = {};
        Integer[] expected = {};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortWithSingleElementArray() {
        Integer[] arr = {42};
        Integer[] expected = {42};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        Assertions.assertArrayEquals(expected, arr);
    }
}