package sortingtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.sorting.merge_sort.MergeSort;

public class MergeSortTest {
    MergeSort sort = new MergeSort();
    @Test
    public void testMergeSort() {
        int[] arr1 = {4, 2, 7, 1, 9};
        sort.mergeSort(arr1);
        int[] result = {1, 2, 4, 7, 9};
        Assertions.assertArrayEquals(result,arr1);

        int[] arr2 = {12, 11, 13, 5, 6, 7};
        sort.mergeSort(arr2);
        int[] result2 = {5, 6, 7, 11, 12, 13};
        Assertions.assertArrayEquals(result2,arr2);

        int[] arr3 = {-12, 11, -13, 5, 6, -7, 0};
        sort.mergeSort(arr3);
        int[] result3 = {-13, -12, -7, 0, 5, 6, 11};
        Assertions.assertArrayEquals(result3,arr3);
    }
}
