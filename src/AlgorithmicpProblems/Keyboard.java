package AlgorithmicpProblems;

import java.util.*;

public class Keyboard {
    public static Map<Character, String> keyboard = new HashMap<>();
    public static List<String> result = new ArrayList<>();


    public static void main(String[] args) {
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        backtrack(input, "", 0);
        System.out.println(result);
    }
    private static void backtrack(String input, String combination, int index) {
        if (index == input.length()) {
            result.add(combination);
            return;
        }

        char currentDigit = input.charAt(index);
        String letters = keyboard.get(currentDigit);

        for (char letter : letters.toCharArray()) {
            backtrack(input, combination + letter, index + 1);
        }
    }
}
