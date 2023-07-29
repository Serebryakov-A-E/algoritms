package AlgorithmicpProblems;

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

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 */
