package AlgorithmicpProblems;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }
    public static int[] plusOne(int[] digits) {
        boolean allNine = true;
        for (int digit : digits) {
            if (digit != 9) {
                allNine = false;
                break;
            }
        }
        if (allNine) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = 0;
            }
            return result;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
