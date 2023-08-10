package algoritms;

/**
 * Класс FibonacciSequence предоставляет методы для генерации последовательности Фибоначчи и вычисления
 * отдельных чисел Фибоначчи.
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(getFibonacci(3));
    }

    /**
     * Генерирует последовательность Фибоначчи указанной длины.
     *
     * @param n Длина желаемой последовательности Фибоначчи.
     * @return Массив целых чисел, представляющий последовательность Фибоначчи.
     */
    public static int[] getSequence(int n) {
        int[] seq = new int[n];
        seq[1] = 1;
        for (int i = 2; i < n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }
        return seq;
    }

    /**
     * Вычисляет n-ое число Фибоначчи.
     *
     * @param n Позиция желаемого числа Фибоначчи.
     * @return n-ое число Фибоначчи.
     */
    public static int getFibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        int[] seq = new int[2];
        seq[1] = 1;
        for (int i = 2; i <= n; i++) {
            int temp = seq[1];
            seq[1] += seq[0];
            seq[0] = temp;
        }
        return seq[1];
    }
}
