package org.sdag.linkedlists;

import org.sdag.interfaces.IRunner;
import org.sdag.queues.ArrayBasedQueueHandler;
import org.sdag.queues.DoubleQueueHandler;
import org.sdag.queues.LinkedListBasedQueueHandler;

import javax.swing.*;
import java.util.Scanner;

public class LinkedListRunner implements IRunner {

    boolean bool = true;
    Scanner scanner = new Scanner(System.in);
    @Override

    public void run() {
        do {
            printMenuLinkedList();
            handleUserChoice();
        } while (bool);
    }

    public void handleLinkedList() {
        LinkedListHandler linkedListHandler = new LinkedListHandler();
        linkedListHandler.run();
    }

    public void handleDoubleLinkedList() {
        DoubleLinkedListHandler doubleLinkedListHandler = new DoubleLinkedListHandler();
        doubleLinkedListHandler.run();
    }

    public void handleCircularLinkedList() {
        CircularLinkedListHandler circularLinkedListHandler = new CircularLinkedListHandler();
        circularLinkedListHandler.run();
    }

    public void handleUserChoice() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter a menu option: "));
        switch (choice) {
            case 1:
                handleLinkedList();
                break;
            case 2:
                handleDoubleLinkedList();
                break;
            case 3:
                handleCircularLinkedList();
                break;
            case 4:
                System.out.println("Returning to the main menu.");
                System.out.println("Are you sure want to the return main menu?");
                System.out.println("y/n: ");
                char decide = scanner.next().toLowerCase().charAt(0);
                if(decide == 'y') {
                    bool = false;
                }
                return;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    public static void printMenuLinkedList() {
        System.out.println("Welcome to the Linked List");
        System.out.println("What do you want to do?");
        System.out.println("Choose an option: ");
        System.out.println("1 - Simple Linked List");
        System.out.println("2 - Double Linked List");
        System.out.println("3 - Circular Linked List");
        System.out.println("4 - Go Back to Main Menu");

    }
}
