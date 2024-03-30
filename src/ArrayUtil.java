public class ArrayUtil {
    /**
     *
     * @param numbers An integer array in which the swap operation needs to be done.
     * @param firstIndex First index to swap.
     * @param secondIndex Second index with which the first index needs to be swapped.
     *
     *  TODO: The stdout logs below needs to be replaced with exceptions.
     */
    protected static void swapArrayElements(int[] numbers, int firstIndex, int secondIndex) {
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

    /**
     *
     * @param numbers An integer array.
     * @param startIndex The start index of the range.
     * @param endIndex The end index of the range(Inclusive).
     * @return The index of the maximum element within the given range.
     *
     * TODO: The stdout logs below needs to be replaced with exceptions.
     */
    protected static int findMaxElementIndexInRange(int[] numbers, int startIndex, int endIndex) {
        if (numbers == null) {
            System.out.println("Invalid array");
            return -1;
        }

        if (numbers.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        boolean isStartIndexInvalid = isArrayIndexValid(numbers, startIndex) == false;
        boolean isEndIndexInvalid = isArrayIndexValid(numbers, endIndex) == false;

        if (isStartIndexInvalid || isEndIndexInvalid) {
            if (isStartIndexInvalid && isEndIndexInvalid) {
                System.out.println("Start & end indexes are invalid");
            } else if (isStartIndexInvalid) {
                System.out.println("Start index is invalid");
            } else {
                System.out.println("End index is invalid");
            }
            return -1;
        } else if (startIndex > endIndex) {
            System.out.println("Start index is beyond the end index");
            return -1;
        }

        if (startIndex == endIndex) {
            return startIndex; // Either return the endIndex since both are same.
        }

        int maxElementIndex = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (numbers[i] > numbers[maxElementIndex]) {
                maxElementIndex = i;
            }
        }

        return maxElementIndex;
    }

    /**
     *
     * @param numbers An integer array.
     * @param indexToCheck The index to check whether the index is within the array bounds.
     * @return A Boolean representing whether the index is valid or not.
     */
    private static boolean isArrayIndexValid(int[] numbers, int indexToCheck) {
        return indexToCheck >= 0 && indexToCheck < numbers.length;
    }
}
