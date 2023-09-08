package tinkoff;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sheriff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> word = new HashMap<>();
        word.put('s', 0);
        word.put('h', 0);
        word.put('e', 0);
        word.put('r', 0);
        word.put('i', 0);
        word.put('f', 0);

        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            if (word.containsKey(c)) {
                word.put(c, word.get(c) + 1);
            }
        }
        word.put('f', word.get('f') / 2);

        int min = word.values().stream().min(Integer::compareTo).get();
        System.out.println(min);
    }
}
