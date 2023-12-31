package algoritms;


/**
 * Алгоритм быстрой сортировки. Работает за O(n log n).
 */
public class QuickSort {
    /**
     * Метод quickSort сортирует массив элементов типа T в порядке возрастания.
     *
     * @param arr   Массив элементов, который требуется отсортировать.
     * @param begin Начальный индекс подмассива, который нужно сортировать.
     * @param end   Конечный индекс подмассива, который нужно сортировать.
     *              Для сортировки всего массива, передайте begin=0 и end=arr.length-1.
     * @param <T>   Тип элементов в массиве, должен реализовывать интерфейс Comparable для сравнения.
     */
    public static <T extends Comparable<T>> void quickSort(T[] arr, int begin, int end) {
        // Рекурсивно сортируем подмассивы, пока не останется один элемент
        if (begin < end) {
            int pivot = pivot(arr, begin, end);

            quickSort(arr, begin, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    /**
     * Метод для разделения подмассива на две части: элементы, меньше пивота, и элементы, больше пивота.
     * Пивот выбирается последним элементом подмассива.
     *
     * @param arr   Массив, который нужно отсортировать.
     * @param begin Начальный индекс подмассива для разделения.
     * @param end   Конечный индекс подмассива для разделения.
     *              (включительно).
     * @param <T>   Тип элементов в массиве, должен реализовывать
     *              интерфейс Comparable для сравнения.
     * @return Индекс пивота после разделения подмассива.
     */
    private static <T extends Comparable<T>> int pivot(T[] arr, int begin, int end) {
        // Выбираем пивот (последний элемент подмассива)
        T pivot = arr[end];
        int i = (begin - 1);

        // Проходим по подмассиву и перемещаем элементы меньше пивота влево
        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                // Меняем местами элементы
                T swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }

        // Помещаем пивот в правильную позицию
        T swap = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swap;

        // Возвращаем индекс пивота после разделения
        return i + 1;
    }
}