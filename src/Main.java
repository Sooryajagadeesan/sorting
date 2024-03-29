import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1, -10, 3, 2, 1, 10};

        SortNumbersUtil.bubbleSort(numbers, SortNumbersUtil.SortOrder.DESCENDING);
        System.out.println(Arrays.toString(numbers));
    }
}