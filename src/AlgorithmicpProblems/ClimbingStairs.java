package AlgorithmicpProblems;

public class ClimbingStairs {
    /**
     * Calculates the number of distinct ways to climb a staircase consisting of 'n' steps.
     *
     * @param n The number of steps in the staircase.
     * @return The number of distinct ways to climb the staircase.
     */
    public int climbStairs(int n) {
        int sum = 1;
        int one = 1;
        int two = 1;

        for (int i = 2; i <= n; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }

        return sum;
    }
}

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45
 */
