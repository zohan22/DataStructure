package sortingtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.sorting.quick_sort.QuickSort;

public class QuickSortTest {
    QuickSort sort = new QuickSort();
    @Test
    public void testQuickSort() {
        int[] arr1 = {4, 2, 7, 1, 9};
        sort.quick(arr1,0, arr1.length - 1);
        int[] sortedArr1 = {1, 2, 4, 7, 9};
        Assertions.assertArrayEquals(sortedArr1, arr1);

        int[] arr2 = {12, 11, -13, 5, 6, -7};
        sort.quick(arr2,0, arr2.length - 1);
        int[] sortedArr2 = {-13, -7, 5, 6, 11, 12};
        Assertions.assertArrayEquals(sortedArr2, arr2);

        int[] arr3 = {5, -3, 10, -8, 15};
        sort.quick(arr3,0, arr3.length - 1);
        int[] sortedArr3 = {-8, -3, 5, 10, 15};
        Assertions.assertArrayEquals(sortedArr3, arr3);
    }
}
