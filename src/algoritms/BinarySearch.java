package algoritms;

public class BinarySearch<T extends Comparable<T>> {
    T[] array;

    public BinarySearch(T[] array) {
        this.array = array;
    }
    
    public int search(T element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            T guess = array[middle];
            if (guess.compareTo(element) == 0) {
                return middle;
            } else if (guess.compareTo(element) < 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
