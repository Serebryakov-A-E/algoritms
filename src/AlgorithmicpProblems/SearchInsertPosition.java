package AlgorithmicpProblems;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        // Пока диапазон поиска не сократится до одного элемента
        while (low <= high) {
            int middle = (low + high) / 2;
            int guess = nums[middle];

            // Сравниваем элемент в середине с искомым элементом
            if (guess == target) {
                return middle; // Элемент найден, возвращаем его индекс
            } else if (guess < target) {
                low = middle + 1; // Элемент в середине меньше искомого, сужаем диапазон поиска справа
            } else {
                high = middle - 1; // Элемент в середине больше искомого, сужаем диапазон поиска слева
            }
        }
        return low;
    }
}
