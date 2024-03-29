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
}
