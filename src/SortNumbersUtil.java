public class SortNumbersUtil extends ArrayUtil {
    enum SortOrder {
        ASCENDING, DESCENDING;
    }

    /**
     *
     * @param numbers An integer array to be sorted.
     * @param sortOrder Order of sorting.
     */
    public static void bubbleSort(int[] numbers, SortOrder sortOrder) {
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean isSwapHappened = false;
            for (int j = 1; j < numbers.length - i; j++) {
                if (sortOrder == SortOrder.DESCENDING) {
                    if (numbers[j] > numbers[j - 1]) {
                        swapArrayElements(numbers, j, j - 1);
                        if (isSwapHappened == false) {
                            isSwapHappened = true;
                        }
                    }
                } else {
                    if (numbers[j] < numbers[j - 1]) {
                        swapArrayElements(numbers, j, j - 1);
                        if (isSwapHappened == false) {
                            isSwapHappened = true;
                        }
                    }
                }

            }

            if (isSwapHappened == false) {
                // When no swaps happened, This means that the array is sorted, so break the loop.
                break;
            }
        }
    }
}
