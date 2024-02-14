package org.sdag.linkedlists;

import org.sdag.Person;
import org.sdag.interfaces.IRunner;

import javax.swing.*;

public class DoubleLinkedListHandler implements IRunner {
    IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
    boolean bool = true;

    @Override
    public void run() {
        do {
            printDoubleLinkedList();
            handler();
        } while(bool);
    }

    public void handler() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice: "));
        switch (choice) {
            case 1:
                JOptionPane.showMessageDialog(null, "Double Linked List size: " + list.size());
                break;
            case 2:
                Integer first = list.first();
                if (first != null) {
                    JOptionPane.showMessageDialog(null, "First element: " + first);
                } else {
                    JOptionPane.showMessageDialog(null, "The list is empty.");
                }
                break;
            case 3:
                Integer last = list.last();
                if (last != null) {
                    JOptionPane.showMessageDialog(null, "Last element: " + last);
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
                Integer removedFirst = list.removeFirst();
                if (removedFirst != null) {
                    JOptionPane.showMessageDialog(null, "First element removed: " + removedFirst);
                    list.printHead();
                } else {
                    JOptionPane.showMessageDialog(null, "The list is empty. Nothing to remove.");
                }
                break;
            case 7:
                Integer removedLast = list.removeLast();
                if (removedLast != null) {
                    JOptionPane.showMessageDialog(null, "Last element removed: " + removedLast);
                    list.printTail();
                } else {
                    JOptionPane.showMessageDialog(null, "The list is empty. Nothing to remove.");
                }
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Printing the double linked list (from head):");
                list.printHead();
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Printing the double linked list (from tail):");
                list.printTail();
                break;
            case 10:
                int decision = JOptionPane.showConfirmDialog(null, "Do you want to exit the linked list menu?", "Exit", JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION) {
                    bool = false;
                }
                return;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid option.");
        }
    }

    public void printDoubleLinkedList() {
        JOptionPane.showMessageDialog(null, """
                Welcome to the Double Linked List
                What do you want to do
                1 - Show the size
                2 - Show the first element
                3 - Show the last element
                4 - Add a first element
                5 - Add a last element
                6 - Remove the first element
                7 - Remove the last element
                8 - Print the linked list (from head)
                9 - Print the linked list (from tail)
                10 - Exit""");
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
                    int value = Integer.parseInt(JOptionPane.showInputDialog("Enter integer value " + (i + 1) + ":"));
                    list.addFirst(value);
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
                    int value = Integer.parseInt(JOptionPane.showInputDialog("Enter integer value " + (i + 1) + ":"));
                    list.addLast(value);
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
