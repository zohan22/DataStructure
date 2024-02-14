package org.sdag.sorting.quick_sort;

import org.sdag.interfaces.IRunner;

import javax.swing.*;
import java.util.Arrays;

public class QuickSortRunner implements IRunner {
    QuickSort sort = new QuickSort();
    boolean bool = true;

    @Override
    public void run() {
        do {
            handler();
        } while(bool);
    }

    public void handler() {
        int option = Integer.parseInt(JOptionPane.showInputDialog("""
                        Welcome to the Quick Sort
                        Choose an option:
                        1 - Sort the elements
                        2 - Return to main menu
                        """));

        switch (option) {
            case 1:
                int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements:"));

                int[] input = new int[n];

                for (int i = 0; i < n; i++) {
                    String inputStr = JOptionPane.showInputDialog("Enter element " + (i + 1) + ":");
                    input[i] = Integer.parseInt(inputStr);
                }

                JOptionPane.showMessageDialog(null, "Array: " + Arrays.toString(input));

                sort.quick(input, 0, input.length - 1);

                JOptionPane.showMessageDialog(null, "Sorted array: " + Arrays.toString(input));
                break;
            case 2:
                int decision = JOptionPane.showConfirmDialog(null, "Do you want to exit the Quick Sort?", "Exit", JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION) {
                    bool = false;
                }
                return;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please choose 1 or 2.");
        }
    }
}
