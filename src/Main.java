import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 500, 2, 3, 100, 4, 5, 600};

        SortNumbersUtil.bubbleSort(numbers, SortNumbersUtil.SortOrder.DESCENDING);
        System.out.println(Arrays.toString(numbers));


        int[] numbersSelectionSort =  {1, 500, 2, 3, 100, 4, 5, 600};
        SortNumbersUtil.selectionSort(numbersSelectionSort, SortNumbersUtil.SortOrder.DESCENDING);
        System.out.println(Arrays.toString(numbersSelectionSort));
    }
}