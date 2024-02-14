package org.sdag.linkedlists;

import org.sdag.interfaces.IRunner;

import javax.swing.*;

public class CircularLinkedListHandler implements IRunner {
    ICircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
    boolean bool = true;

    @Override
    public void run() {
        do {
            printCircularLinkedList();
            handler();
        } while (bool);
    }

    public void handler() {
        try {
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice: "));
            switch (choice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Circular Linked List size: " + circularLinkedList.size());
                    break;
                case 2:
                    CircularNode<Integer> first = circularLinkedList.first();
                    if (first != null) {
                        JOptionPane.showMessageDialog(null, "First element: " + first.data);
                    } else {
                        JOptionPane.showMessageDialog(null, "The list is empty.");
                    }
                    break;
                case 3:
                    CircularNode<Integer> last = circularLinkedList.last();
                    if (last != null) {
                        JOptionPane.showMessageDialog(null, "Last element: " + last.data);
                    } else {
                        JOptionPane.showMessageDialog(null, "The list is empty.");
                    }
                    break;
                case 4:
                    addFirstElement();
                    break;
                case 5:
                    addLastElement();
                    break;
                case 6:
                    circularLinkedList.removeFirst();
                    JOptionPane.showMessageDialog(null, "First element removed.");
                    circularLinkedList.print();
                    break;
                case 7:
                    circularLinkedList.rotate();
                    JOptionPane.showMessageDialog(null, "Circular Linked List rotated.");
                    circularLinkedList.print();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Printing the circular linked list:");
                    circularLinkedList.print();
                    break;
                case 9:
                    int decision = JOptionPane.showConfirmDialog(null, "Do you want to exit the circular linked list menu?", "Exit", JOptionPane.YES_NO_OPTION);
                    if (decision == JOptionPane.YES_OPTION) {
                        bool = false;
                    }
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid option.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    public void printCircularLinkedList() {
        JOptionPane.showMessageDialog(null, """
                Welcome to the Circular Linked List
                What do you want to do
                1 - Show the size
                2 - Show the first element
                3 - Show the last element
                4 - Add a first element
                5 - Add a last element
                6 - Remove the first element
                7 - Rotate the circular linked list
                8 - Print the circular linked list
                9 - Exit""");
    }

    public void addFirstElement() {
        do {
            try {
                String input = JOptionPane.showInputDialog("Enter the number of integers to add:");
                if (input == null) {
                    break;
                }

                int numberOfIntegers = Integer.parseInt(input);
                for (int i = 0; i < numberOfIntegers; i++) {
                    int value = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer for element " + (i + 1) + ":"));
                    circularLinkedList.addFirst(value);
                    JOptionPane.showMessageDialog(null, "Element Added first: " + value);
                }

                int choice = JOptionPane.showConfirmDialog(null, "Do you want to add more integers?", "Continue?", JOptionPane.YES_NO_OPTION);
                if (choice != JOptionPane.YES_OPTION) {
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        } while (true);
    }

    public void addLastElement() {
        do {
            try {
                String input = JOptionPane.showInputDialog("Enter the number of integers to add:");
                if (input == null) {
                    break;
                }

                int numberOfIntegers = Integer.parseInt(input);
                for (int i = 0; i < numberOfIntegers; i++) {
                    int value = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer for element " + (i + 1) + ":"));
                    circularLinkedList.addLast(value);
                    JOptionPane.showMessageDialog(null, "Element Added last: " + value);
                }

                int choice = JOptionPane.showConfirmDialog(null, "Do you want to add more integers?", "Continue?", JOptionPane.YES_NO_OPTION);
                if (choice != JOptionPane.YES_OPTION) {
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        } while (true);
    }
}
