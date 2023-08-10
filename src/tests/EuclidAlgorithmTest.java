package tests;

import algoritms.EuclidAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuclidAlgorithmTest {
    @Test
    public void testGcd() {
        assertEquals(5, EuclidAlgorithm.gcd(10, 15));
        assertEquals(6, EuclidAlgorithm.gcd(18, 24));
        assertEquals(1, EuclidAlgorithm.gcd(17, 23));
        assertEquals(7, EuclidAlgorithm.gcd(49, 21));
        assertEquals(21, EuclidAlgorithm.gcd(21, 0));
        assertEquals(21, EuclidAlgorithm.gcd(0, 21));
        assertEquals(0, EuclidAlgorithm.gcd(0, 0));
    }

    @Test
    public void testGcd2() {
        assertEquals(5, EuclidAlgorithm.gcd2(10, 15));
        assertEquals(6, EuclidAlgorithm.gcd2(18, 24));
        assertEquals(1, EuclidAlgorithm.gcd2(17, 23));
        assertEquals(7, EuclidAlgorithm.gcd2(49, 21));
        assertEquals(21, EuclidAlgorithm.gcd2(21, 0));
        assertEquals(21, EuclidAlgorithm.gcd2(0, 21));
        assertEquals(0, EuclidAlgorithm.gcd2(0, 0));
    }

}