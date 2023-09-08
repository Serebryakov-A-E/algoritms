package AlgorithmicpProblems;

/**
 * https://leetcode.com/problems/is-subsequence/submissions/
 */
public class Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa", "bbaaaa"));
    }
    public static boolean isSubsequence(String s, String t) {
        int strikes = 0;
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int i1 = lastIndex; i1 < t.length(); i1++) {
                if (t.charAt(i1) == s.charAt(i)) {
                    strikes++;
                    lastIndex = i1 + 1;
                    break;
                }
            }
        }
        return strikes == s.length();
    }
}
