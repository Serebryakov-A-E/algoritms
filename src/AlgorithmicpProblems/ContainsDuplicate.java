package AlgorithmicpProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/submissions/
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        return nums.length != Arrays.stream(nums).distinct().toArray().length;
    }
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
