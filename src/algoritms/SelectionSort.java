package algoritms;

/**
 * Алгоритм сортировки выбором. Работает за О(n^2).
 */
public class SelectionSort {
    /**
     * Сортирует указанный массив объектов, реализующих интерфейс Comparable, по возрастанию.
     *
     * @param array Массив, который нужно отсортировать.
     * @param <T> Тип элементов в массиве, должен реализовывать интерфейс Comparable для сравнения.
     * @return Отсортированный массив.
     */
    public static <T extends Comparable<T>> T[] selectionSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            T smallest = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (smallest.compareTo(array[j]) > 0) {
                    smallestIndex = j;
                    smallest = array[j];
                }
            }
            array[smallestIndex] = array[i];
            array[i] = smallest;
        }
        return array;
    }
}
