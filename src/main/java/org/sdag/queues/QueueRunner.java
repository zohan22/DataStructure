package org.sdag.queues;

import org.sdag.interfaces.IRunner;

import javax.swing.*;
import java.util.Scanner;


public class QueueRunner implements IRunner {
    boolean running = true;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        do {
            printMenuQueue();
            handleUserChoice();
        } while (running);
    }

    public void handleArrayBasedQueue() {
        ArrayBasedQueueHandler arrayQueueHandler = new ArrayBasedQueueHandler();
        arrayQueueHandler.run();
    }

    public void handleLinkedListBasedQueue() {
        LinkedListBasedQueueHandler linkedQueueHandler = new LinkedListBasedQueueHandler();
        linkedQueueHandler.run();
    }

    public void handleDoubleQueue() {
        DoubleQueueHandler doubleQueueHandler = new DoubleQueueHandler();
        doubleQueueHandler.run();
    }

    public void handleUserChoice() {
        int choice = scanner.nextInt();
        //int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter a menu option: "));
        switch (choice) {
            case 1:
                handleArrayBasedQueue();
                break;
            case 2:
                handleLinkedListBasedQueue();
                break;
            case 3:
                handleDoubleQueue();
                break;
            case 4:
                System.out.println("Returning to the main menu.");
                System.out.println("Are you sure want to the return main menu?");
                System.out.println("s/n: ");
                char decide = scanner.next().toLowerCase().charAt(0);
                if(decide == 's') {
                    running = false;
                }
                return;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    public void printMenuQueue(){
        System.out.println("Welcome to the Queues");
        System.out.println("What do you want to do?");
        System.out.println("Choose an option: ");
        System.out.println("1 - Array based Queue");
        System.out.println("2 - Linked List based Queue");
        System.out.println("3 - Double-Ended Queue");
        System.out.println("4 - Go Back to Main Menu");
    }
}
