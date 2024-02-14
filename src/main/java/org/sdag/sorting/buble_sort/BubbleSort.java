package org.sdag.sorting.buble_sort;

import java.util.Arrays;

public class BubbleSort {

    public void BubbleSort() {
    }
    public void bubble(int[] array) {
        if (isOrder(array)) {
            System.out.println("The array is already sorted: " + Arrays.toString(array));
            return;
        }

        int size = array.length;
        int aux;
        System.out.println("Initial " + Arrays.toString(array));
        System.out.println("------");

        for (int i = 0; i < size - 1; i++) {
            System.out.println("Step # - " + (i + 1));

            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }

                System.out.println(j + " change: " + Arrays.toString(array));
            }

            System.out.println("------");
        }

        System.out.println("Finally " + Arrays.toString(array));
    }

    public static boolean isOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
