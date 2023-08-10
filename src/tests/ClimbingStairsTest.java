package tests;

import AlgorithmicpProblems.ClimbingStairs;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, 3",
            "4, 5",
            "5, 8",
            "6, 13",
            "7, 21"
    })
    void testClimbStairs(int n, int expected) {
        int result = climbingStairs.climbStairs(n);
        assertEquals(expected, result, "For n = " + n);
    }
}