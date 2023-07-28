package Tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Проверка является ли число палиндромом без преобразования в строку.
 * Runtime 7ms Beats 100.00%of users with Java
 * Memory 42.68mb Beats 89.99%of users with Java
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        //Если число отрицательное, то автоматические не палиндром
        if (x < 0) {
            return false;
        }
        //преобразуем число в массив, путем добавления остатка
        List<Integer> numbers = new ArrayList<>();
        int value = x;
        while (value > 0) {
            numbers.add(value % 10);
            value = value / 10;
        }
        //создаем и заполняем перевернутый массив
        List<Integer> reverse = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverse.add(numbers.get(i));
        }
        //проверяем соответствие массивов
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != reverse.get(i)) {
                return false;
            }
        }
        return true;
    }
}
