package tests;

import algoritms.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    public void testSortIntArray() {
        Integer[] arr = {5, 2, 7, 3, 1, 8, 4, 6};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortStringArray() {
        String[] arr = {"banana", "apple", "orange", "grape"};
        String[] expected = {"apple", "banana", "grape", "orange"};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortSingleElementArray() {
        Integer[] arr = {5};
        Integer[] expected = {5};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortEmptyArray() {
        Double[] arr = new Double[0];
        Double[] expected = new Double[0];
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }
}