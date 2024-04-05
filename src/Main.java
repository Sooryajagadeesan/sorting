import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 500, 2, 3,-1000, 100, 4, 5, 0, 600, -2};

        SortNumbersUtil.bubbleSort(numbers, SortNumbersUtil.SortOrder.ASCENDING);
        System.out.println(Arrays.toString(numbers));


        int[] numbersSelectionSort =  {1, 500, 2, 3,-1000, 100, 4, 5, 0, 600, -2};
        SortNumbersUtil.selectionSort(numbersSelectionSort, SortNumbersUtil.SortOrder.ASCENDING);
        System.out.println(Arrays.toString(numbersSelectionSort));

        int[] insertionSortNumbers = {1, 500, 2, 3,-1000, 100, 4, 5, 0, 600, -2};
        SortNumbersUtil.insertionSort(insertionSortNumbers, SortNumbersUtil.SortOrder.ASCENDING);
        System.out.println(Arrays.toString(insertionSortNumbers));
    }
}