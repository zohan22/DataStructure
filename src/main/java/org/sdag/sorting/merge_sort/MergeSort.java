package org.sdag.sorting.merge_sort;

public class MergeSort {

    public void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, arr.length - middle);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
