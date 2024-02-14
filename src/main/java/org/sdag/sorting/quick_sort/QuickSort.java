package org.sdag.sorting.quick_sort;

import java.util.Arrays;

public class QuickSort {
    public QuickSort(){
    }

    public static void exchange(int[] a, int x, int y){
        int aux = a[x];
        a[x] = a[y];
        a[y] = aux;
    }

    public  void quick(int[] array, int first, int last){
        int middle = (first + last) /2;
        int pivot = array[middle];
        int i = first;
        int j = last;

        do {
            while(array[i] < pivot) {
                i++;
            }
            while(array[j] > pivot) {
                j--;
            }
            if(i <= j) {
                exchange(array, i, j);
                i++;
                j--;
            }
        } while(i <= j);

        if(first < j) {
            quick(array, first,j);
        }
        if(i < last) {
            quick(array, i, last);
        }
        showArray(array);
    }

    public static void showArray(int[] array){
        int k;
        for(k = 0;k < array.length; k++) {
            System.out.print("[" + array[k] + "]");
        }
        System.out.println();

    }
}
