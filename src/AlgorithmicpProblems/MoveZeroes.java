package AlgorithmicpProblems;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nulls = new int[]{0};
        System.out.println(Arrays.toString(nulls));
        moveZeroes(nulls);
        System.out.println(Arrays.toString(nulls));
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int i1 = i + 1; i1 < nums.length; i1++) {
                    if (nums[i1] != 0) {
                        nums[i] = nums[i1];
                        nums[i1] = 0;
                        break;
                    }
                }
            }
        }
    }
}
