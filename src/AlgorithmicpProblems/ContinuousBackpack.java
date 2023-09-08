package AlgorithmicpProblems;

import java.util.*;
public class ContinuousBackpack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int backpackSize = scanner.nextInt();

        if (backpackSize == 0 || n == 0) {
            System.out.println("0.000");
            return;
        }

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            int size = scanner.nextInt();
            items.add(new Item(price, size));
        }
        Collections.sort(items);

        double sum = 0;
        for (Item item : items) {
            if (backpackSize >= item.size) {
                sum += item.price;
                backpackSize -= (int) item.size;
            } else {
                sum += ((double) backpackSize / item.size) * item.price;
                break;
            }
        }
        System.out.printf("%.3f", sum);
    }
}

class Item implements Comparable<Item> {
    double price;
    double size;

    public Item(double price, double size) {
        this.price = price;
        this.size = size;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(o.price / o.size, this.price / this.size);
    }
}

/*
Выведите максимальную стоимость частей предметов (от каждого предмета можно отделить любую часть,
стоимость и объём при этом пропорционально уменьшатся), помещающихся в данный рюкзак, с точностью
не менее трёх знаков после запятой.

Sample Input:

3 50
60 20
100 50
120 30
Sample Output:

180.000
 */