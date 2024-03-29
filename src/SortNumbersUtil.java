public class SortNumbersUtil {
    enum SortOrder {
        ASCENDING, DESCENDING;
    }

    /**
     *
     * @param numbers An integer array to be sorted.
     * @param sortOrder Order of sorting.
     */
    public static void bubbleSort(int[] numbers, SortOrder sortOrder) {
        if (sortOrder != SortOrder.DESCENDING) {
            sortOrder = SortOrder.ASCENDING;
        }

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


    /**
     *
     * @param numbers An integer array in which the swap operation needs to be done.
     * @param firstIndex First index to swap.
     * @param secondIndex Second index with which the first index needs to be swapped.
     *
     *  TODO: The stdout logs below needs to be replaced with exceptions.
     */
    private static void swapArrayElements(int[] numbers, int firstIndex, int secondIndex) {
        if (numbers == null) {
            System.out.println("Array is invalid");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        boolean isFirstIndexInvalid = firstIndex < 0 || firstIndex >= numbers.length;
        boolean isSecondIndexInvalid = secondIndex < 0 || secondIndex >= numbers.length;

        if (isFirstIndexInvalid || isSecondIndexInvalid) {
            if (isFirstIndexInvalid && isSecondIndexInvalid) {
                System.out.println("First & second indexes are invalid");
            } else if (isFirstIndexInvalid){
                System.out.println("First index is invalid");
            } else {
                System.out.println("Second index is invalid");
            }
            return;
        } else if (firstIndex == secondIndex) {
            System.out.println("First index and second index are same, Invalid indexes");
            return;
        }

        // Swap
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }
}
