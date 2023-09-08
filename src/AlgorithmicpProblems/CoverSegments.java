package AlgorithmicpProblems;

import java.util.*;

public class CoverSegments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            pairs.add(new Pair(a, b));
        }
        Collections.sort(pairs);

        List<Integer> result = new ArrayList<>();
        result.add(pairs.get(0).last);

        int last = 0;
        for (int i = 1; i < pairs.size(); i++) {
            int first = pairs.get(i).first;
            if (first > result.get(last)) {
                result.add(pairs.get(i).last);
                last++;
            }
        }
        System.out.println(result.size());
        result.forEach(elem -> System.out.print(elem + " "));
    }
}
class Pair implements Comparable<Pair> {
    int first;
    int last;

    public Pair(int first, int last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    @Override
    public int compareTo(Pair o) {
        return this.last - o.last;
    }
}

/*
По данным n отрезкам необходимо найти множество точек минимального размера, для которого каждый
из отрезков содержит хотя бы одну из точек.

Sample Input 1:

3
1 3
2 5
3 6
Sample Output 1:

1
3
Sample Input 2:

4
4 7
1 3
2 5
5 6
Sample Output 2:

2
3 6
 */