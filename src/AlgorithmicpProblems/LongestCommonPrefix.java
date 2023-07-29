package AlgorithmicpProblems;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();

        int smallest = findSmallest(strs);

        for (int i = 0; i < smallest; i++) {
            char last = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != last) {
                    return sb.toString();
                }
            }
            sb.append(last);
        }
        return sb.toString();
    }

    private int findSmallest(String[] strs) {
        int smallest = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < smallest) {
                smallest = str.length();
            }
        }
        return smallest;
    }
}

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */