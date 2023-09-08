package tinkoff;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WildWest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            deque.addLast(a);
            deque.addLast(a);
        }

        int sum = 0;
        Queue<Integer> result = new LinkedList<>();
        while (sum < number && !deque.isEmpty()) {
            int i = deque.pollLast();
            sum += i;
            if (sum == number) {
                result.add(i);
                break;
            } else if (sum > number) {
                sum -= i;
            } else {
                result.add(i);
            }
        }
        if (sum == number) {
            System.out.println(result.size());
            result.forEach(elem -> System.out.print(elem + " "));
        } else {
            System.out.println(-1);
        }
    }
}
