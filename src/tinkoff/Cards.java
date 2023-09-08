package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        int[] wining = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wining[i] = scanner.nextInt();
        }

        if (n == 1) {
            if (cards[0] == wining[0]) {
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;
        }


        int left = 0;
        int right = n - 1;

        while (left < n && cards[left] == wining[left]) {
            left++;
        }

        while (right >= 0 && cards[right] == wining[right]) {
            right--;
        }

        int[] subCards = new int[right - left + 1];
        int[] subWin = new int[right - left + 1];

        int j = 0;
        for (int i = left; i <= right; i++) {
            subCards[j] = cards[i];
            subWin[j] = wining[i];
            j++;
        }

        int[] sorted = Arrays.stream(subCards).sorted().toArray();

        if (Arrays.compare(sorted, subWin) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
