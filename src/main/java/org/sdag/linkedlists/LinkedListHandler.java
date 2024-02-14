package org.sdag.linkedlists;

import org.sdag.Person;
import org.sdag.interfaces.IRunner;

import javax.swing.*;

public class LinkedListHandler implements IRunner {
    ILinkedList<Person> list = new LinkedList<>();
    boolean bool = true;

    @Override
    public void run() {
        do {
            printLinkedList();
            handler();
        } while(bool);
    }

    public void handler() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice: "));
        switch (choice) {
            case 1:
                JOptionPane.showMessageDialog(null, "Linked List size: " + list.size());
                break;
            case 2:
                Node<Person> first = list.first();
                if(first != null) {
                    JOptionPane.showMessageDialog(null, "First element: " + first.data.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "The list is empty.");
                }
                break;
            case 3:
                Node<Person> last = list.last();
                if(last != null) {
                    JOptionPane.showMessageDialog(null, "Last element: " + last.data.toString());
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
                list.removeFirst();
                JOptionPane.showMessageDialog(null, "First element removed.");
                JOptionPane.showMessageDialog(null, "Updated linked list:");
                list.print();
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Printing the linked list:");
                list.print();
                break;
            case 8:
                int decision = JOptionPane.showConfirmDialog(null, "Do you want to exit the linked list menu?", "Exit", JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION) {
                    bool = false;
                }
                return;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid option.");
        }
    }

    public void printLinkedList() {
        JOptionPane.showMessageDialog(null, """
                Welcome to the Linked List
                What do you want to do
                1 - Show the size
                2 - Show the first element
                3 - Show the last element
                4 - Add a first element
                5 - Add a last element
                6 - Remove the first element
                7 - Print the linked list
                8 - Exit""");
    }

    public void addFirstElement() {
        do {
            try {
                String input = JOptionPane.showInputDialog("Enter the number of persons to add:");
                if (input == null) {
                    break;
                }

                int numberOfPersons = Integer.parseInt(input);
                for (int i = 0; i < numberOfPersons; i++) {
                    String name = JOptionPane.showInputDialog("Enter name for person " + (i + 1) + ":");
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age for person " + (i + 1) + ":"));
                    Person person = new Person(name, age);
                    list.addFirst(person);
                    JOptionPane.showMessageDialog(null, "Element Added first: " + person);
                }

                int choice = JOptionPane.showConfirmDialog(null, "Do you want to add more persons?", "Continue?", JOptionPane.YES_NO_OPTION);
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
                String input = JOptionPane.showInputDialog("Enter the number of persons to add:");
                if (input == null) {
                    break;
                }

                int numberOfPersons = Integer.parseInt(input);
                for (int i = 0; i < numberOfPersons; i++) {
                    String name = JOptionPane.showInputDialog("Enter name for person " + (i + 1) + ":");
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age for person " + (i + 1) + ":"));
                    Person person = new Person(name, age);
                    list.addLast(person);
                    JOptionPane.showMessageDialog(null, "Element Added last: " + person);
                }

                int choice = JOptionPane.showConfirmDialog(null, "Do you want to add more persons?", "Continue?", JOptionPane.YES_NO_OPTION);
                if (choice != JOptionPane.YES_OPTION) {
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        } while (true);
    }
}
