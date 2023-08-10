package algoritms;
/**
 * Класс EuclidAlgorithm предоставляет метод для вычисления наибольшего общего делителя (НОД)
 * двух целых чисел с использованием алгоритма Эвклида.
 */
public class EuclidAlgorithm {
    /**
     * Вычисляет наибольший общий делитель (НОД) двух целых чисел с использованием алгоритма Эвклида.
     *
     * @param a Первое целое число.
     * @param b Второе целое число.
     * @return Наибольший общий делитель (НОД) двух чисел a и b.
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a >= b) {
            return gcd(a % b, b);
        }
        return gcd(a, b % a);
    }

    public static int gcd2(int a, int b) {
        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a == 0 ? b : a;
    }
}
