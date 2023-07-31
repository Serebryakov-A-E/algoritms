package AlgorithmicpProblems;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean start = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && start) {
                return length;
            } else if (s.charAt(i) != ' ') {
                start = true;
                length += 1;
            }
        }
        return length;
    }
}
