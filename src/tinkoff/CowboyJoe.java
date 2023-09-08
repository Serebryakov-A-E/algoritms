package tinkoff;

import java.util.*;

public class CowboyJoe {
    public static Map<Integer, Integer> count = new HashMap<>();
    public static ArrayList<Band> bands = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            count.put(i, 1);
        }

        for (int i = 1; i <= n; i++) {
            bands.add(new Band(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int t = scanner.nextInt();
            if (t == 1) {
                //объединение в банду
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                union(first, second);
            } else if (t == 2) {
                //Находятся ли духи в общей банде
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                sb.append(isSameBand(first, second) ? "YES" : "NO").append("\n");
            } else if (t == 3) {
                //в скольких бандах был дух
                int dux = scanner.nextInt();
                sb.append(count.get(dux)).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isSameBand(int first, int second) {
        if (first == second) {
            return true;
        }
        for (Band band : bands) {
            if (band.isSameBand(first, second)) {
                return true;
            }
        }
        return false;
    }

    public static void union(int first, int second) {
        //обновляем кол-во банд в которых побывал дух
        count.put(first, count.get(first) + 1);
        count.put(second, count.get(second) + 1);

        //добавляем элемент в первую банду и удаляем вторую
        Band band = new Band();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).contain(second)) {
                band.addAll(bands.get(i));
                bands.remove(bands.get(i));
            }
        }
        for (Band value : bands) {
            if (value.contain(first)) {
                value.addAll(band);
            }
        }
    }
}

class Band {
    List<Integer> list = new ArrayList<>();

    public Band(int n) {
        list.add(n);
    }

    public Band() {
    }

    public void add(int elem) {
        list.add(elem);
    }

    public void addAll(Band band) {
        list.addAll(band.list);
    }

    public boolean isSameBand(int first, int second) {
        return list.contains(first) && list.contains(second);
    }

    public boolean contain(int elem) {
        return list.contains(elem);
    }
}