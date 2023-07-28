package tests;

import algoritms.BinarySearch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    static Integer[] array;

    @BeforeAll
    static void create() {
        array = new Integer[]{1, 2, 10, 22, 34, 100};
    }

    @Test
    void searchTest() {
        int result = BinarySearch.search(array, 1);
        assertEquals(0, result);

        result = BinarySearch.search(array, 22);
        assertEquals(3, result);

        result = BinarySearch.search(array, -50);
        assertEquals(-1, result);

        result = BinarySearch.search(array, 500);
        assertEquals(-1, result);

        result = BinarySearch.search(array, 100);
        assertEquals(5, result);

        result = BinarySearch.search(array, 2);
        assertEquals(1, result);
    }
}