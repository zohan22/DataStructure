package sortingtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.sorting.buble_sort.BubbleSort;

public class BubbleSortTest {
    BubbleSort bubble = new BubbleSort();
    @Test
    public void testBubbleSort() {
        int[] arr1 = {4, 2, 7, 1, 9};
        bubble.bubble(arr1);
        int[] result = {1, 2, 4, 7, 9};
        Assertions.assertArrayEquals(result, arr1);

        int[] arr2 = {12, 11, 13, 5, 6, 7};
        bubble.bubble(arr2);
        int[] result2 = {5, 6, 7, 11, 12, 13};
        Assertions.assertArrayEquals(result2, arr2);

        int[] arr3 = {5, -3, 10, -8, 15};
        bubble.bubble(arr3);
        int[] result3 = {-8, -3, 5, 10, 15};
        Assertions.assertArrayEquals(result3, arr3);
    }
}
