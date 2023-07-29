package AlgorithmicpProblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для преобразования римских чисел в целые числа.
 */
public class RomanToInteger {
    private static Map<Character, Integer> values = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * Преобразует римское число в целое число.
     *
     * @param romanNumber строка, представляющая римское число
     * @return целочисленное значение римского числа
     */
    public static int romanToInt(String romanNumber) {
        if (romanNumber.length() == 1) {
            return values.get(romanNumber.charAt(0));
        }
        int number = 0;

        int current;
        int last = Integer.MAX_VALUE;
        for (int i = 0; i < romanNumber.length(); i++) {
            current = values.get(romanNumber.charAt(i));
            if (current <= last) {
                number += current;
            } else {
                number -= last;
                number += current - last;
            }
            last = current;
        }
        return number;
    }
}

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
