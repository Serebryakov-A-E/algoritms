package Tasks;

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
