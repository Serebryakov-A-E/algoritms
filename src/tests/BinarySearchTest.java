package tests;

import algoritms.BinarySearch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    static Integer[] array;
    static BinarySearch<Integer> binarySearch;

    @BeforeAll
    static void create() {
        array = new Integer[]{1, 2, 10, 22, 34, 100};
        binarySearch = new BinarySearch<>(array);
    }

    @Test
    void searchTest() {
        int result = binarySearch.search(1);
        assertEquals(0, result);

        result = binarySearch.search(22);
        assertEquals(3, result);

        result = binarySearch.search(-50);
        assertEquals(-1, result);

        result = binarySearch.search(500);
        assertEquals(-1, result);

        result = binarySearch.search(100);
        assertEquals(5, result);

        result = binarySearch.search(2);
        assertEquals(1, result);
    }
}