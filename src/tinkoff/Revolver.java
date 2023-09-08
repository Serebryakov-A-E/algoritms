package tinkoff;

import java.util.Scanner;

public class Revolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt();


        int mostExpensive = 0;
        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            if (price <= sum && price > mostExpensive) {
                mostExpensive = price;
            }
        }
        System.out.println(mostExpensive);
    }
}
