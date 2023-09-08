package AlgorithmicpProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VariousEdible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> addends = new ArrayList<>();
        int current = 1;

        while (n >= current) {
            addends.add(current);
            n -= current;
            current++;
        }

        addends.set(addends.size() - 1, addends.get(addends.size() - 1) + n);

        System.out.println(addends.size());
        for (int num : addends) {
            System.out.print(num + " ");
        }
    }
}
