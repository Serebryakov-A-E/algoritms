package tests;

import algoritms.FibonacciSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {


    @Test
    void getSequence() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] result = FibonacciSequence.getSequence(10);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetFibonacci() {
        assertEquals(0, FibonacciSequence.getFibonacci(0));
        assertEquals(1, FibonacciSequence.getFibonacci(1));
        assertEquals(1, FibonacciSequence.getFibonacci(2));
        assertEquals(2, FibonacciSequence.getFibonacci(3));
        assertEquals(3, FibonacciSequence.getFibonacci(4));
        assertEquals(5, FibonacciSequence.getFibonacci(5));
        assertEquals(8, FibonacciSequence.getFibonacci(6));
        assertEquals(13, FibonacciSequence.getFibonacci(7));
        assertEquals(21, FibonacciSequence.getFibonacci(8));
        assertEquals(34, FibonacciSequence.getFibonacci(9));
    }
}